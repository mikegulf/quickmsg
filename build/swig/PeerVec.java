/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package quickmsg;

public class PeerVec {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected PeerVec(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PeerVec obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        quickmsg_javaJNI.delete_PeerVec(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PeerVec() {
    this(quickmsg_javaJNI.new_PeerVec__SWIG_0(), true);
  }

  public PeerVec(long n) {
    this(quickmsg_javaJNI.new_PeerVec__SWIG_1(n), true);
  }

  public long size() {
    return quickmsg_javaJNI.PeerVec_size(swigCPtr, this);
  }

  public long capacity() {
    return quickmsg_javaJNI.PeerVec_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    quickmsg_javaJNI.PeerVec_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return quickmsg_javaJNI.PeerVec_isEmpty(swigCPtr, this);
  }

  public void clear() {
    quickmsg_javaJNI.PeerVec_clear(swigCPtr, this);
  }

  public void add(Peer x) {
    quickmsg_javaJNI.PeerVec_add(swigCPtr, this, Peer.getCPtr(x), x);
  }

  public Peer get(int i) {
    long cPtr = quickmsg_javaJNI.PeerVec_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new Peer(cPtr, false);
  }

  public void set(int i, Peer val) {
    quickmsg_javaJNI.PeerVec_set(swigCPtr, this, i, Peer.getCPtr(val), val);
  }

}
