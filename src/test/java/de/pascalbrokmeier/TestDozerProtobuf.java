package de.pascalbrokmeier;

import de.pascalwhoop.powertac.grpc.GrpcMessages;
import de.pascalwhoop.powertac.grpc.PBBroker;
import junit.framework.TestCase;
import org.junit.Test;
import org.powertac.common.Broker;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class TestDozerProtobuf

{
    GRPCTypeConverter conv = new GRPCTypeConverter();

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

}
