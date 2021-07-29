# PlayStore_Java
Section 1: The classes and their attributes Group A  - content classes You may need to define methods wherever appropriate to support these classes. Class Content  Mobile apps and publication items are Content of the PlayStore. Each Content (either application or publication) is associated with the following information: an ID, name, number of downloads, price, and reviews. Reviews is a collection of Comment objects (see Group B for details). Class Content cannot and should not be instantiated. Class Application  Application is a type of Content. In addition to the data that a content class have, an Application object has an OS type that presents the minimum operating system requirement. An Application object can be initialized as Application g1 = new Application("g1", "Pokemon", 5.3, "androidV4"); In the above example 5.3 is the price of the app in dollars, “androidV4” is the OS requirement. Initially the number of downloads is zero, and the reviews are empty. Application app1 = new Application("app1", "Calendar", "androidV3"); If no price is provided, the application is then free. Class Publication Another type of Content is Publication. In addition to the data that the Content class has, a Publication object also has: publisher and number of pages. Class Book  One type of Publication is Book, which has an additional data: the author name. Notes, it is possible that one book have multiple authors. A Book object can be initialized as String[] authors = {"L. Tolstoy"};  Book b1 = new Book ("b1", "War and Peace", 12.55, "The Russian Messenger", 1225, authors); “War and Peace” is the name of the book; 12.55 is the price; “The Russian Messenger” is the publisher. The book has 1225 pages and is of course authored by “L. Tolstoy”.
