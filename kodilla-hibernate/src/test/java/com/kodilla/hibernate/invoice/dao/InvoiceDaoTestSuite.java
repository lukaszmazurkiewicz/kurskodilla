package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Autowired
    ProductDao productDao;

    @Autowired
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Pen");
        Product product2 = new Product("Pencil");
        Product product3 = new Product("Ruler");

        productDao.saveAll(Arrays.asList(product1, product2, product3));

        Item item1 = new Item(product1, new BigDecimal(200), 20, new BigDecimal(4000));
        Item item2 = new Item(product2, new BigDecimal(100), 10, new BigDecimal(1000));
        Item item3 = new Item(product1, new BigDecimal(333), 100, new BigDecimal(33300));
        Item item4 = new Item(product3, new BigDecimal(1), 1, new BigDecimal(1));
        Item item5 = new Item(product2, new BigDecimal(1000), 1000, new BigDecimal(1000000));

        Invoice invoice1 = new Invoice("132/01/2019");

        invoice1.setItemList(Arrays.asList(item1,item2,item3,item4,item5));

        //When
        invoiceDao.save(invoice1);
        String number = invoice1.getNumber();
        List<Invoice> invoices = invoiceDao.findByNumber(number);

        //Then
        Assert.assertEquals(1, invoices.size());
        Assert.assertEquals(5, itemDao.count());

        //CleanUp

        invoiceDao.delete(invoice1);
        productDao.deleteAll(Arrays.asList(product1,product2,product3));
    }


}
