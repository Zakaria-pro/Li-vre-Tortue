When i run code on my computer, it gives me this error :

``` 
language: none Exception in thread "main" java.lang.Error: Unresolved compilation problem:
        Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )

        at MyWindow.initComponents(MyWindow.java:61)
        at MyWindow.<init>(MyWindow.java:34)
        at Main.main(Main.java:4)
```

i commented the line where it was the error but i still get the same error message \
in first i was using this code to put an icon in a button
``` java
path_tortue = "C:\\Users\\hp\\OneDrive\\Bureau\\Java\\Multithreading\\tortue.png"   
Icon icon1 = new ImageIcon(path_tortue);
tortue = new JButton(icon1);
```
and then i changed it to this one 
``` java
tortue = new JButton();
tortue.setIcon(new ImageIcon(Class.class.getResource("/resources/tortue.png")));
```
but i still get the same error message
