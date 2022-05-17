package co.com.reto.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CreateBusinessUnitsPage extends PageObject {
    public static final Target SELECT_ORGANIZATION = Target.the("Select option organization").
            located(By.xpath("/html/body/aside/div[2]/div[2]/div[1]/ul/li[3]/ul/li[1]/a/span"));
    public static final Target SELECT_BUSINESS_UNITS = Target.the("Select option business units").
            located(By.xpath("/html/body/aside/div[2]/div[2]/div[1]/ul/li[3]/ul/li[1]/ul/li[1]/a/span"));
    public static final Target NEW_BUSINESS_UNITS = Target.the("Select new business units").
            located(By.xpath("/html/body/main/section/div/div[2]/div[2]/div/div/div[1]/div/span"));
    public static final Target INPUT_NAME_UNIT = Target.the("Insert name business units").
            located(By.xpath("/html/body/div[4]/div[2]/div/div[2]/form/div/div[1]/div/div/div[1]/input"));
    public static final Target PARENT_UNIT = Target.the("Select parent unit").
            located(By.id("s2id_Serenity_Pro_Organization_BusinessUnitDialog3_ParentUnitId"));
    public static final Target SELECT_PARENT = Target.the("Select option parent unit").
            located(By.xpath("/html/body/div[7]/ul/li[2]/div"));
    public static final Target SAVE_BUSINESS_UNITS = Target.the("Save business units").
            located(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div/div/div/div[1]/div/span"));

    public static final Target SEARCH_BUSINESS_UNITS = Target.the("Search business units").
            located(By.xpath("/html/body/main/section/div/div[2]/div[1]/input"));
    public static final Target LOCATED_BUSINESS_UNITS = Target.the("Located business units").
            located(By.xpath("//div[@class='slick-viewport slick-viewport-top slick-viewport-left']//*[contains(text(),'FirstUnits')]"));




}
