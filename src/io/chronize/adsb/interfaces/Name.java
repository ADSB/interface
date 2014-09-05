package io.chronize.adsb.interfaces;

public class Name implements Comparable<Name> {
	private String _firstName;

	/**
	 * Constructs io.chronize.adsb.interfaces.Name with empty default first name
	 */
	public Name() {
		this("");
	}

	public Name(String firstName) {
		_firstName = firstName;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	/**
	 * Calculates the relative comparison between two Names by comparing their initial characters.
	 *
	 * @param name An instance of io.chronize.adsb.interfaces.Name to compare.
	 *
	 * @return relative comparison
	 */
	@Override
	public int compareTo(Name name) {
		return new Character(_firstName.charAt(0)).compareTo(name.getFirstName().charAt(0));
	}

	/**
	 * Returns a the first name.
	 *
	 * @return first name
	 */
	@Override
	public String toString() {
		return _firstName;
	}
}
