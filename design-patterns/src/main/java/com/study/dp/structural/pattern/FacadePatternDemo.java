package com.study.dp.structural.pattern;

import javax.activation.DataSource;

class Report {

	private ReportHeader header;
	private ReportData data;
	private ReportFooter footer;

	public ReportHeader getHeader() {
		return header;
	}

	public void setHeader(ReportHeader header) {
		System.out.println("Setting report header");
		this.header = header;
	}

	public ReportData getData() {
		return data;
	}

	public void setData(ReportData data) {
		System.out.println("Setting report data");
		this.data = data;
	}

	public ReportFooter getFooter() {
		return footer;
	}

	public void setFooter(ReportFooter footer) {
		System.out.println("Setting report footer");
		this.footer = footer;
	}
}

class ReportFooter {

}

class ReportHeader {

}

class ReportData {

}

enum ReportType {
	PDF, HTML
}

class ReportWriter {

	public void writeHtmlReport(Report report, String location) {
		System.out.println("HTML Report written");

		// implementation
	}

	public void writePdfReport(Report report, String location) {
		System.out.println("Pdf Report written");

		// implementation
	}
}

class ReportGeneratorFacade {
	public static void generateReport(ReportType type, DataSource dataSource, String location) {
		if (type == null || dataSource == null) {
			// throw some exception
		}
		// Create report
		Report report = new Report();

		report.setHeader(new ReportHeader());
		report.setFooter(new ReportFooter());

		// Get data from dataSource and set to ReportData object

		report.setData(new ReportData());

		// Write report
		ReportWriter writer = new ReportWriter();
		switch (type) {
		case HTML:
			writer.writeHtmlReport(report, location);
			break;

		case PDF:
			writer.writePdfReport(report, location);
			break;
		}
	}
}

public class FacadePatternDemo {
	public static void main(String[] args) throws Exception {
		ReportGeneratorFacade reportGeneratorFacade = new ReportGeneratorFacade();

		reportGeneratorFacade.generateReport(ReportType.HTML, null, null);

		reportGeneratorFacade.generateReport(ReportType.PDF, null, null);
	}
}
