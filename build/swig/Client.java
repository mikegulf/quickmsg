/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package quickmsg;

public class Client {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Client(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Client obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        quickmsg_javaJNI.delete_Client(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Client(String srv_name) {
    this(quickmsg_javaJNI.new_Client(srv_name), true);
  }

  public SWIGTYPE_p_std__shared_ptrT_quickmsg__ServiceReply_t call(String msg, int timeout_s) throws quickmsg.ServiceCallTimeout {
    return new SWIGTYPE_p_std__shared_ptrT_quickmsg__ServiceReply_t(quickmsg_javaJNI.Client_call__SWIG_0(swigCPtr, this, msg, timeout_s), true);
  }

  public SWIGTYPE_p_std__shared_ptrT_quickmsg__ServiceReply_t call(String msg) throws quickmsg.ServiceCallTimeout {
    return new SWIGTYPE_p_std__shared_ptrT_quickmsg__ServiceReply_t(quickmsg_javaJNI.Client_call__SWIG_1(swigCPtr, this, msg), true);
  }

  public String calls(String req, int timeout_s) throws quickmsg.ServiceCallTimeout {
    return quickmsg_javaJNI.Client_calls__SWIG_0(swigCPtr, this, req, timeout_s);
  }

  public String calls(String req) throws quickmsg.ServiceCallTimeout {
    return quickmsg_javaJNI.Client_calls__SWIG_1(swigCPtr, this, req);
  }

}