/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package quickmsg;

public class GroupNode {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GroupNode(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GroupNode obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        quickmsg_javaJNI.delete_GroupNode(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GroupNode(String description, boolean promiscuous) {
    this(quickmsg_javaJNI.new_GroupNode__SWIG_0(description, promiscuous), true);
  }

  public GroupNode(String description) {
    this(quickmsg_javaJNI.new_GroupNode__SWIG_1(description), true);
  }

  public GroupNode() {
    this(quickmsg_javaJNI.new_GroupNode__SWIG_2(), true);
  }

  public void join(String group) {
    quickmsg_javaJNI.GroupNode_join__SWIG_0(swigCPtr, this, group);
  }

  public void wait_join(String group) {
    quickmsg_javaJNI.GroupNode_wait_join(swigCPtr, this, group);
  }

  public void leave(String group) {
    quickmsg_javaJNI.GroupNode_leave(swigCPtr, this, group);
  }

  public void register_handler(String group, IMessageCallback cb) {
    quickmsg_javaJNI.GroupNode_register_handler(swigCPtr, this, group, cb);
  }

  public void register_whispers(IMessageCallback cb) {
    quickmsg_javaJNI.GroupNode_register_whispers(swigCPtr, this, cb);
  }

  public void shout(String group, String msg) {
    quickmsg_javaJNI.GroupNode_shout(swigCPtr, this, group, msg);
  }

  public void whisper(SWIGTYPE_p_std__shared_ptrT_quickmsg__Peer_t peer, String msg) {
    quickmsg_javaJNI.GroupNode_whisper(swigCPtr, this, SWIGTYPE_p_std__shared_ptrT_quickmsg__Peer_t.getCPtr(peer), msg);
  }

  public void whispers(String peer_uuid, String msg) {
    quickmsg_javaJNI.GroupNode_whispers(swigCPtr, this, peer_uuid, msg);
  }

  public void peers(SWIGTYPE_p_std__vectorT_std__shared_ptrT_quickmsg__Peer_t_t ps) {
    quickmsg_javaJNI.GroupNode_peers(swigCPtr, this, SWIGTYPE_p_std__vectorT_std__shared_ptrT_quickmsg__Peer_t_t.getCPtr(ps));
  }

  public void peers_by_description(SWIGTYPE_p_std__vectorT_std__shared_ptrT_quickmsg__Peer_t_t ps, String desc) {
    quickmsg_javaJNI.GroupNode_peers_by_description(swigCPtr, this, SWIGTYPE_p_std__vectorT_std__shared_ptrT_quickmsg__Peer_t_t.getCPtr(ps), desc);
  }

  public void stop() {
    quickmsg_javaJNI.GroupNode_stop(swigCPtr, this);
  }

  public void spin() {
    quickmsg_javaJNI.GroupNode_spin(swigCPtr, this);
  }

  public void async_spin() {
    quickmsg_javaJNI.GroupNode_async_spin(swigCPtr, this);
  }

  public void join() {
    quickmsg_javaJNI.GroupNode_join__SWIG_1(swigCPtr, this);
  }

  public static String name() {
    return quickmsg_javaJNI.GroupNode_name();
  }

}
