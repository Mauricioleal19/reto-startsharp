package co.com.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateMeetingPage extends PageObject {

    public static final Target SELECT_MEETING = Target.the("Select option meeting").
            located(By.xpath("/html/body/aside/div[2]/div[2]/div[1]/ul/li[3]/ul/li[2]/a/span"));
    public static final Target SELECT_MEETINGS = Target.the("Select option meetings").
            located(By.xpath("/html/body/aside/div[2]/div[2]/div[1]/ul/li[3]/ul/li[2]/ul/li[1]/a/span"));
    public  static final Target SELECT_NEW_MEETING = Target.the("Select option new meeting").
            located(By.xpath("//div[@class='button-outer']//span"));

    public static final Target INPUT_NAME_MEETING = Target.the("Enter meeting name").
            located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingName"));
    public static final Target SELECT_MEETING_TYPE = Target.the("Select meeting type").
            located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_MeetingTypeId"));
    public static final Target SELECT_TYPE = Target.the("Select option meeting type").
            located(By.id("select2-result-label-16"));
    public static final Target INPUT_MEETING_NUMBER = Target.the("Enter meeting number").
            located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber"));
    public static final Target INPUT_START_DATE = Target.the("Enter start date meeting").
            located(By.id("Serenity_Pro_Meeting_MeetingDialog10_StartDate"));
    public static final Target START_TIME = Target.the("Enter start time meeting").
            located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[4]/select/option[97]"));

    public static final Target INPUT_END_DATE = Target.the("Enter end date meeting").
            located(By.id("Serenity_Pro_Meeting_MeetingDialog10_EndDate"));
    public static final Target END_TIME = Target.the("Enter start time meeting").
            located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[5]/select/option[109]"));

    public static final Target LOCATION = Target.the("Select location").
            located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_LocationId"));
    public static final Target LOCATION_OPTION = Target.the("Select option location").
            located(By.xpath("/html/body/div[7]/ul/li[2]/div"));

    public static final Target SELECT_UNIT = Target.the("Select unit").
            located(By.id("select2-chosen-8"));
    public static final Target INPUT_UNIT_OPTION = Target.the("Enter option unit").
            located(By.id("s2id_autogen8_search"));
    public static final Target SELECT_UNIT_OPTION = Target.the("Select option unit").
            located(By.xpath("//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active select2-drop-above']//*[contains(text(),'FirstUnits')]"));

    public static final Target SELECT_ORGANIZED = Target.the("Select organized by").
            located(By.id("select2-chosen-9"));
    public static final Target SELECT_ORGANIZED_OPTION = Target.the("Select the organizer option").
            located(By.id("select2-result-label-134"));
    public static final Target SELECT_REPORTER = Target.the("Select reporter").
            located(By.id("select2-chosen-10"));
    public static final Target SELECT_REPORTER_OPTION = Target.the("Select the reporter option").
          located(By.xpath("//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active select2-drop-above']//*[contains(text(),'Adam Stewart')]"));

    public static final Target SELECT_ATTENDEE = Target.the("Select attendee list").
            located(By.id("select2-chosen-12"));
    public static final Target SELECT_ATTENDEE_OPTION = Target.the("Select the attendee list option").
            located(By.xpath("//ul[@id='select2-results-12']//*[contains(text(),'Alexis Lopez')]"));

    public static final Target SAVE_MEETING = Target.the("Select save meeting").
            located(By.xpath("//div[@class='button-outer']//*[contains(text(),' Save')]"));












}

