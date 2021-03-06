#ifndef __PUBLISHER_WRAP_H_INCLUDED__
#define __PUBLISHER_WRAP_H_INCLUDED__

#include <quickmsg/ctypes.h>

#ifdef __cplusplus
extern "C" {
#endif

  typedef enum {
    qm_wait, qm_nowait
  } wait_mode_t;

  QM_EXPORT qm_publisher_t
  qm_publisher_new (const char* topic, wait_mode_t wait);

  QM_EXPORT void
  qm_publisher_destroy (qm_publisher_t self_p);

  QM_EXPORT void
  qm_publish(qm_publisher_t self_p, const char* msg);


#ifdef __cplusplus
}
#endif

#endif
