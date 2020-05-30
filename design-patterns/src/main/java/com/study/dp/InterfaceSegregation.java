package com.study.dp;

/**
 * 
 * @author Sara Kanase We can print or scan or fax
 */
class Document {

}

interface Machine {
	void print();

	void scan();

	void fax();
}

class OldPrinter implements Machine {

	@Override
	public void print() {
		// supported method
	}

	@Override
	public void scan() {
		throw new RuntimeException("Not Supportted");

	}

	@Override
	public void fax() {
		throw new RuntimeException("Not Supportted");

	}

	// split Machine into smaller interfaces

	interface Printer {
		void print();
	}

	interface Scanner {
		void scan();
	}

	interface Fax {
		void fax();
	}

	class OldPrinterNewImpl implements Printer {

		@Override
		public void print() {
			// TODO Auto-generated method stub

		}

	}

	class ModernPrinter implements Printer, Scanner, Fax {

		@Override
		public void print() {
		}

		@Override
		public void fax() {
		}

		@Override
		public void scan() {
		}
	}

}

public class InterfaceSegregation {

}
