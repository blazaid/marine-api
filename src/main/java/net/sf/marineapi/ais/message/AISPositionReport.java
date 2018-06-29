/*
 * AISPositionReport.java
 * Copyright (C) 2015 Lázár József
 *
 * This file is part of Java Marine API.
 * <http://ktuukkan.github.io/marine-api/>
 *
 * Java Marine API is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * Java Marine API is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Java Marine API. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.marineapi.ais.message;

/**
 * Common interface for all messages providing position reports.
 * 
 * @author Lázár József
 */
public interface AISPositionReport extends AISPositionInfo {

	/**
	 * Returns the navigational status.
	 */
	int getNavigationalStatus();

	/**
	 * Returns the rate of turn.
	 */
	double getRateOfTurn();

	/**
	 * Returns the speed over ground.
	 */
	double getSpeedOverGround();

	/**
	 * Returns the course over ground.
	 */
	double getCourseOverGround();

	/**
	 * Returns the true heading.
	 */
	int getTrueHeading();

	/**
	 * Returns the time stamp contained in the message.
	 */
	int getTimeStamp();

	/**
	 * Returns the manouver indicator.
	 */
	int getManouverIndicator();

	/**
	 * Returns true if rate of turn is available in the message.
	 */
	boolean isRateOfTurnAvailable();

	/**
	 * Returns true if speed over ground is available in the message.
	 */
	boolean isSpeedOverGroundAvailable();

	/**
	 * Returns true if course over ground is available in the message.
	 */
	boolean isCourseOverGroundAvailable();

	/**
	 * Returns true if true heading is available in the message.
	 */
	boolean isTrueHeadingAvailable();

	/**
	 * Returns true if timestamp is available in the message.
	 */
	boolean isTimeStampAvailable();
}
