package cn.arsenals.os.faceunlock.camera.listeners;

public interface CallableListener {
    void onComplete(Object value);

    void onError(Exception exc);
}
