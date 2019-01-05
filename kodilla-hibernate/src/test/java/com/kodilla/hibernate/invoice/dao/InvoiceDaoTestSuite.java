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

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Pen");
        Product product2 = new Product("Pencil");
        Product product3 = new Product("Ruler");

        Item item1 = new Item(product1, new BigDecimal(200), 20, new BigDecimal(4000));
        Item item2 = new Item(product2, new BigDecimal(100), 10, new BigDecimal(1000));
        Item item3 = new Item(product1, new BigDecimal(333), 100, new BigDecimal(33300));
        Item item4 = new Item(product3, new BigDecimal(1), 1, new BigDecimal(1));
        Item item5 = new Item(product2, new BigDecimal(1000), 1000, new BigDecimal(1000000));

        Invoice invoice1 = new Invoice("132/01/2019");

        invoice1.getItemList().add(item1);
        invoice1.getItemList().add(item2);
        invoice1.getItemList().add(item3);
        invoice1.getItemList().add(item4);
        invoice1.getItemList().add(item5);

        //When
        invoiceDao.save(invoice1);
        String number = invoice1.getNumber();
        int id = invoice1.getId();

        //Then
        Assert.assertEquals(1, invoiceDao.findByNumber(number));

        //CleanUp

        //invoiceDao.deleteById(id);
    }


}
