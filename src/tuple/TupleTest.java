package tuple;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import comparator.EnigmaObject;

public class TupleTest {

	@Test
	public void makeTuple() {
		EnigmaObject bob = new EnigmaObject(1);
		EnigmaObject bill = new EnigmaObject(1);
		Tuple tuple = new Tuple(bob, bill);
		
		assertTrue(tuple.getFront()==bob);
		assertTrue(tuple.getBack()==bill);
	}
	
}
