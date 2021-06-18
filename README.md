Internship project

The project involved building a front end for an application that scans an invoice and recognizes specific fields and their values. The idea is that this application will reduce the amount of work needed for data entry into a system. 

The scanned fields allow us to choose from numeric/text values that are recognized in the document so that we can even manually change the values if they are not correct. We can also add our own values that are not found on the invoice at all. When we click on one of the recognized fields, all possible values for that field found on the invoice will be surrounded by a color coded rectangle. For example, if I click on the VAT field, it will show me all possible values for it on the document itself. Currently selected value will have a solid line around it, whereas all other options will have a dashed line around them. If we change the value in our field, the lines will adjust accordingly. 

This concept works vice versa as well. If we click on some value on the scanned invoice itself, all possible fields where this value could be applied will light up in green. 

Another feature is that we can add multiple VAT fields and they will all behave the same. This will also affect the final summary page where we should have the appropriate amount of VAT fields.

Once we are happy with our values, we can submit the document which will take us to the next page where we can see the summary of everytihing we have entered and we have the option to export the document in .csv format.

Use test_invoice.jpg to test the project

![](fraunhoferdemo.gif)
