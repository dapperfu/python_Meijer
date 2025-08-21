package X2;

import androidx.view.c0;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LX2/d;", "", "<init>", "()V", "Landroidx/lifecycle/c0;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/c0;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f41518a = new d();

    public final <T extends c0> T a(Class<T> modelClass) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(modelClass, "modelClass");
        try {
            T tNewInstance = modelClass.getDeclaredConstructor(null).newInstance(null);
            Intrinsics.g(tNewInstance);
            return tNewInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e12);
        }
    }

    private d() {
    }
}
