package de.pascalbrokmeier;

import de.pascalwhoop.powertac.grpc.PBBroker;
import org.junit.Before;
import org.junit.Test;
import org.powertac.common.Broker;

import static org.junit.Assert.assertEquals;

public class TestDozerProtobuf

{
    private GRPCTypeConverter conv = new GRPCTypeConverter();
    private Broker b;

    @Before
    public void beforeEach() {
        b = new Broker("Chicken", "eggs", "food", "farm");
    }

    @Test
    public void convertProtobuf() {
        PBBroker pbf = conv.convertGeneric(b, PBBroker.class);
        assertEquals(b.getPassword(), pbf.getPassword());
    }

    @Test
    public void convertProtobufExplicit() {
        PBBroker pbf = conv.convertGeneric(b, PBBroker.class);
        assertEquals(b.getUsername(), pbf.getUsername());
    }

    @Test
    public void convertGeneric() {
        TestBroker f = conv.convertGeneric(b, TestBroker.class);
        assertEquals(b.getUsername(), f.getUsername());
    }

    @Test
    public void convertGenericWithoutSetter() {
        TestBroker f = conv.convertGeneric(b, TestBroker.class);
        assertEquals(b.getKey(), f.getKey());
    }

    @Test
    public void convertGenericWithoutSetterExplicit() {
        TestBroker f = conv.convertGeneric(b, TestBroker.class);
        assertEquals(b.getPassword(), f.getPassword());
    }

}
