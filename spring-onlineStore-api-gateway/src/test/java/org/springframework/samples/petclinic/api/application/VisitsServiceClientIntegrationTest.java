package org.springframework.samples.petclinic.api.application;

class VisitsServiceClientIntegrationTest {

//    private static final Integer PET_ID = 1;
//
//    private VisitsServiceClient visitsServiceClient;
//
//    private MockWebServer server;
//
//    @BeforeEach
//    void setUp() {
//        server = new MockWebServer();
//        visitsServiceClient = new VisitsServiceClient(WebClient.builder());
//        visitsServiceClient.setHostname(server.url("/").toString());
//    }
//
//    @AfterEach
//    void shutdown() throws IOException {
//        this.server.shutdown();
//    }
//
//    @Test
//    void getVisitsForPets_withAvailableVisitsService() {
//        prepareResponse(response -> response
//            .setHeader("Content-Type", "application/json")
//            .setBody("{\"items\":[{\"id\":5,\"date\":\"2018-11-15\",\"description\":\"test visit\",\"petId\":1}]}"));
//
//        Mono<Visits> accounts = visitsServiceClient.getVisitsForPets(Collections.singletonList(1));
//
//        assertVisitDescriptionEquals(accounts.block(), PET_ID,"test visit");
//    }
//
//
//    private void assertVisitDescriptionEquals(Visits accounts, int petId, String description) {
//        assertEquals(1, accounts.getItems().size());
//        assertNotNull(accounts.getItems().get(0));
//        assertEquals(petId, accounts.getItems().get(0).getPetId());
//        assertEquals(description, accounts.getItems().get(0).getDescription());
//    }
//
//    private void prepareResponse(Consumer<MockResponse> consumer) {
//        MockResponse response = new MockResponse();
//        consumer.accept(response);
//        this.server.enqueue(response);
//    }

}
