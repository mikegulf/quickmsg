/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package quickmsg;

public class Subscriber {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Subscriber(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Subscriber obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        quickmsg_javaJNI.delete_Subscriber(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Subscriber(String topic, long queue_size) {
    this(quickmsg_javaJNI.new_Subscriber__SWIG_0(topic, queue_size), true);
  }

  public Subscriber(String topic) {
    this(quickmsg_javaJNI.new_Subscriber__SWIG_1(topic), true);
  }

  public MessageVec messages() {
    return new MessageVec(quickmsg_javaJNI.Subscriber_messages(swigCPtr, this), true);
  }

  public void join() {
    quickmsg_javaJNI.Subscriber_join(swigCPtr, this);
  }

}
