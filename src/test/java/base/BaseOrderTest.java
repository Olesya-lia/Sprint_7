package base;

import data.TestData;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import model.OrderModel;
import org.junit.After;
import org.junit.Before;

import static data.TestData.*;
import static steps.OrderSteps.*;

public class BaseOrderTest {
    public OrderModel order;
    public Integer track;
    public Response response;

    @Before
    public void setup() {
        RestAssured.baseURI = BASE_URL;
        order = TestData.getBaseOrder();
        response = makeOrder(order);
        track = getTrackNumber(response);
    }

    @After
    public void tearDown() {
        if (track != 0) {
            cancelOrder(track);
        }
    }
}