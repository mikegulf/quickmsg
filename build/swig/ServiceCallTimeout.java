/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package quickmsg;

public class ServiceCallTimeout extends java.lang.Exception {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ServiceCallTimeout(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ServiceCallTimeout obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        quickmsg_javaJNI.delete_ServiceCallTimeout(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public String getMessage() {
    return what();
  }

  public ServiceCallTimeout() {
    this(quickmsg_javaJNI.new_ServiceCallTimeout__SWIG_0(), true);
  }

  public ServiceCallTimeout(String msg) {
    this(quickmsg_javaJNI.new_ServiceCallTimeout__SWIG_1(msg), true);
  }

  public String what() {
    return quickmsg_javaJNI.ServiceCallTimeout_what(swigCPtr, this);
  }

}
