package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

/* loaded from: classes.dex */
public class CoreComponentFactory extends AppComponentFactory {

    public interface a {
        Object a();
    }

    static <T> T a(T t10) {
        T t11;
        return (!(t10 instanceof a) || (t11 = (T) ((a) t10).a()) == null) ? t10 : t11;
    }

    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Activity) a(super.instantiateActivity(classLoader, str, intent));
    }

    public Application instantiateApplication(ClassLoader classLoader, String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Application) a(super.instantiateApplication(classLoader, str));
    }

    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (ContentProvider) a(super.instantiateProvider(classLoader, str));
    }

    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (BroadcastReceiver) a(super.instantiateReceiver(classLoader, str, intent));
    }

    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Service) a(super.instantiateService(classLoader, str, intent));
    }
}
