/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package quickmsg;

public class MessageVec {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MessageVec(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MessageVec obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        quickmsg_javaJNI.delete_MessageVec(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MessageVec() {
    this(quickmsg_javaJNI.new_MessageVec__SWIG_0(), true);
  }

  public MessageVec(long n) {
    this(quickmsg_javaJNI.new_MessageVec__SWIG_1(n), true);
  }

  public long size() {
    return quickmsg_javaJNI.MessageVec_size(swigCPtr, this);
  }

  public long capacity() {
    return quickmsg_javaJNI.MessageVec_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    quickmsg_javaJNI.MessageVec_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return quickmsg_javaJNI.MessageVec_isEmpty(swigCPtr, this);
  }

  public void clear() {
    quickmsg_javaJNI.MessageVec_clear(swigCPtr, this);
  }

  public void add(Message x) {
    quickmsg_javaJNI.MessageVec_add(swigCPtr, this, Message.getCPtr(x), x);
  }

  public Message get(int i) {
    long cPtr = quickmsg_javaJNI.MessageVec_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new Message(cPtr, false);
  }

  public void set(int i, Message val) {
    quickmsg_javaJNI.MessageVec_set(swigCPtr, this, i, Message.getCPtr(val), val);
  }

}
