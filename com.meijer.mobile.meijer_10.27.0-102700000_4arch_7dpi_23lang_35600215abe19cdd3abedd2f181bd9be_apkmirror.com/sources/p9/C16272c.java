package p9;

import android.annotation.SuppressLint;
import android.app.Activity;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp9/c;", "", "<init>", "()V", "Landroid/app/Activity;", "a", "()Landroid/app/Activity;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: p9.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16272c {
    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    public Activity a() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Activity activity = null;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", null).invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            Intrinsics.i(declaredField, "getDeclaredField(...)");
            declaredField.setAccessible(true);
            Map mapK = (Map) declaredField.get(objInvoke);
            if (mapK == null) {
                mapK = MapsKt.k();
            }
            for (Object obj : mapK.values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                Intrinsics.i(declaredField2, "getDeclaredField(...)");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    Intrinsics.i(declaredField3, "getDeclaredField(...)");
                    declaredField3.setAccessible(true);
                    activity = (Activity) declaredField3.get(obj);
                }
            }
        } catch (Exception unused) {
        }
        return activity;
    }
}
