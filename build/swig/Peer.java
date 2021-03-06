/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package quickmsg;

public class Peer {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Peer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Peer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        quickmsg_javaJNI.delete_Peer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Peer(String uuid, String desc) {
    this(quickmsg_javaJNI.new_Peer(uuid, desc), true);
  }

  public String uuid() {
    return quickmsg_javaJNI.Peer_uuid(swigCPtr, this);
  }

  public String description() {
    return quickmsg_javaJNI.Peer_description(swigCPtr, this);
  }

}
