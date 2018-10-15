///////////////////////////////////////////////////////////////////////////////
// File: ItemType.java
// By:   Greening, Zachary
// Date: September 28, 2018
// Description: An enumerator for the class of item (ie a type of audio for
//      music).
///////////////////////////////////////////////////////////////////////////////

package productionline;


public enum ItemType {
  AUDIO("AU"), VISUAL("VI"), AUDIO_MOBILE("AM"), VISUAL_MOBILE("VM");

  String code;                    //Letter code indicating the item type

  ItemType(String code) {
    this.code = code;
  }
}
