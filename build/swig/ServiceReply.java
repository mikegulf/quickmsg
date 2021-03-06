/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package quickmsg;

public class ServiceReply extends Message {
  private transient long swigCPtr;

  protected ServiceReply(long cPtr, boolean cMemoryOwn) {
    super(quickmsg_javaJNI.ServiceReply_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ServiceReply obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        quickmsg_javaJNI.delete_ServiceReply(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ServiceReply() {
    this(quickmsg_javaJNI.new_ServiceReply__SWIG_0(), true);
  }

  public ServiceReply(ServiceReply s) {
    this(quickmsg_javaJNI.new_ServiceReply__SWIG_1(ServiceReply.getCPtr(s), s), true);
  }

  public ServiceReply(Message r, boolean success) {
    this(quickmsg_javaJNI.new_ServiceReply__SWIG_2(Message.getCPtr(r), r, success), true);
  }

  public ServiceReply(Message r) {
    this(quickmsg_javaJNI.new_ServiceReply__SWIG_3(Message.getCPtr(r), r), true);
  }

  public void setSuccessful(boolean value) {
    quickmsg_javaJNI.ServiceReply_successful_set(swigCPtr, this, value);
  }

  public boolean getSuccessful() {
    return quickmsg_javaJNI.ServiceReply_successful_get(swigCPtr, this);
  }

}
