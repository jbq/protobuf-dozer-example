package de.pascalbrokmeier;

import de.pascalwhoop.powertac.grpc.PBBroker;
import org.junit.Test;
import org.powertac.common.Broker;

import static org.junit.Assert.assertEquals;

public class TestDozerProtobuf

{
    private GRPCTypeConverter conv = new GRPCTypeConverter();

    @Test
    public void convertProtobuf() {
        Broker b = new Broker("Chicken", "eggs", "food", "farm");
        PBBroker pbf = conv.convertGeneric(b, PBBroker.class);
        assertEquals(b.getUsername(), pbf.getUsername());
    }

    @Test
    public void convertGeneric() {
        Broker b = new Broker("Chicken", "eggs", "food", "farm");
        TestBroker f = conv.convertGeneric(b, TestBroker.class);
        assertEquals(b.getUsername(), f.getUsername());

    }

    @Test
     public void convertGenericWithoutSetter() {
        Broker b = new Broker("Chicken", "eggs", "food", "farm");
        TestBroker f = conv.convertGeneric(b, TestBroker.class);
        assertEquals(b.getPassword(), f.getPassword());

    }

}
