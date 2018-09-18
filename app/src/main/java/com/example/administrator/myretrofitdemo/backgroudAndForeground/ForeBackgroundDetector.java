package com.example.administrator.myretrofitdemo.backgroudAndForeground;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


@SuppressLint("NewApi")
public class ForeBackgroundDetector implements Application.ActivityLifecycleCallbacks{
    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {

    }

    @Override
    public void onActivityStarted(Activity activity) {

    }

    @Override
    public void onActivityResumed(Activity activity) {

    }

    @Override
    public void onActivityPaused(Activity activity) {

    }

    @Override
    public void onActivityStopped(Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {

    }


//	public static final String TAG = ForeBackgroundDetector.class.getName();
//    public static final long CHECK_DELAY = 2000;
//
//    public interface Binding {
//        public void unbind();
//    }
//
//    private interface Callback {
//        public void invoke(MXKit.MXForegroundListener listener, Context context);
//    }
//
//    private static class Listeners {
//        private List<MXKit.MXForegroundListener> listenerList = new CopyOnWriteArrayList<MXKit.MXForegroundListener>();
//
//        public Binding add(final MXKit.MXForegroundListener listener){
//            listenerList.add(listener);
//            return new Binding(){
//                public void unbind() {
//                    listenerList.remove(listener);
//                }
//            };
//        }
//
//        public void each(Callback callback, Context context){
//        	for(MXKit.MXForegroundListener listener : listenerList){
//        		if(listener != null){
//        			callback.invoke(listener, context);
//        		}else{
//        			Log.e(TAG, "Listener is null!");
//        		}
//        	}
//        }
//    }
//
//    private static Callback becameForeground = new Callback() {
//        @Override
//        public void invoke(MXKit.MXForegroundListener listener, Context context) {
//            listener.onBecameForeground(context);
//        }
//    };
//
//    private static Callback becameBackground = new Callback() {
//        @Override
//        public void invoke(MXKit.MXForegroundListener listener, Context context) {
//            listener.onBecameBackground(context);
//        }
//    };
//
//    private static ForeBackgroundDetector instance;
//
//    private boolean foreground;
//    private Activity current;
//    private Listeners listeners = new Listeners();
//    private Handler handler = new Handler();
//    private Runnable check;
//
//    public static ForeBackgroundDetector init(Application application){
//        if (instance == null) {
//            instance = new ForeBackgroundDetector();
//            application.registerActivityLifecycleCallbacks(instance);
//        }
//        return instance;
//    }
//
//    public static ForeBackgroundDetector getInstance(Application application){
//        if (instance == null) {
//            init(application);
//        }
//        return instance;
//    }
//
//    public static ForeBackgroundDetector getInstance(){
//        if (instance == null) {
//            throw new IllegalStateException(
//                "Foreground is not initialised - first invocation must use parameterised init/get");
//        }
//        return instance;
//    }
//
//    public boolean isForeground(){
//        return foreground;
//    }
//
//    public boolean isBackground(){
//        return !foreground;
//    }
//
//    public Binding addListener(MXKit.MXForegroundListener listener){
//        return listeners.add(listener);
//    }
//
//    @Override
//    public void onActivityResumed(Activity activity) {
//        current = activity;
//        // remove any scheduled checks since we're starting another activity
//        // we're definitely not going background
//        if (check != null) {
//            handler.removeCallbacks(check);
//        }
//
//        // check if we're becoming foreground and notify listeners
//        if (!foreground && (activity != null && !activity.isChangingConfigurations())){
//            foreground = true;
//            listeners.each(becameForeground, activity);
//        }
//
//        boolean isStartGesturePsd = MXKit.getInstance().isStartGesturePsd();
//        if (!isStartGesturePsd) {
//            boolean isPopupShowed = MXSharePreferenceEngine.isPopupShowed(activity);
//            if (activity.getComponentName() != null) {
//                String className = activity.getComponentName().getShortClassName();
//                if(!TextUtils.isEmpty(className)){
//                    if (isPopupShowed && className.contains("ClientTabActivity")) {
//                        WebService.getInstance().showPopView(activity);
//                    }
//                }
//            }
//        }
//
//    }
//
//
//	@Override
//    public void onActivityPaused(Activity activity) {
//        // if we're changing configurations we aren't going background so
//        // no need to schedule the check
//        if (!activity.isChangingConfigurations()) {
//            // don't prevent activity being gc'd
//        	if(!BackgroundDetector.getInstance().isDetectorStop() && !(activity instanceof MXChatActivity) && !(activity instanceof MXContactsActivity) && !(activity instanceof MXAppCenterActivity) && !(activity instanceof MXCircleActivity)){
//       		 final WeakReference<Activity> ref = new WeakReference<Activity>(activity);
//                handler.postDelayed(check = new Runnable() {
//                    @Override
//                    public void run() {
//                        onActivityCeased(ref.get());
//                    }
//                }, CHECK_DELAY);
//            }
//        }
//    }
//
//    @Override
//    public void onActivityStarted(Activity activity) {
//    }
//
//    @Override
//    public void onActivityStopped(Activity activity) {
//        if (check != null) {
//            handler.removeCallbacks(check);
//        }
//        if (!BackgroundDetector.getInstance().isDetectorStop()){
//            onActivityCeased(activity);
//        }
//    }
//
//    @Override
//    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
//    }
//
//    @Override
//    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
//    }
//
//    @Override
//    public void onActivityDestroyed(Activity activity) {
//    }
//
//
//    private void onActivityCeased(Activity activity){
//        if (foreground) {
//            if ((activity == current) && (activity != null && !activity.isChangingConfigurations())){
//                foreground = false;
////                Log.w(TAG, "去到了后台");
//                listeners.each(becameBackground, activity);
//
//            } else {
//            }
//        } else {
//        }
//    }

}
