WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
List<WebElement> x = driver.findElements(By.tagName("a"));
// To find the count of the link
System.out.println(x.size());
// To print all links
for (WebElement x1 : x) {
System.out.println(x1.getAttribute("href"));