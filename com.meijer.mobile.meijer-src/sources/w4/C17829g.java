package w4;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a3\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "C", "Ljava/lang/Class;", "klass", "", "suffix", "a", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
/* renamed from: w4.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17829g {
    public static final <T, C> T a(Class<C> klass, String suffix) throws ClassNotFoundException {
        String name;
        String str;
        Intrinsics.j(klass, "klass");
        Intrinsics.j(suffix, "suffix");
        Package r02 = klass.getPackage();
        if (r02 == null || (name = r02.getName()) == null) {
            name = "";
        }
        String canonicalName = klass.getCanonicalName();
        Intrinsics.g(canonicalName);
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            Intrinsics.i(canonicalName, "substring(...)");
        }
        String str2 = StringsKt.P(canonicalName, '.', '_', false, 4, null) + suffix;
        try {
            if (name.length() == 0) {
                str = str2;
            } else {
                str = name + '.' + str2;
            }
            Class<?> cls = Class.forName(str, true, klass.getClassLoader());
            Intrinsics.h(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>");
            return (T) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + str2 + " does not exist. Is Room annotation processor correctly configured?", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Cannot access the constructor " + klass.getCanonicalName(), e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException("Failed to create an instance of " + klass.getCanonicalName(), e12);
        }
    }

    public static /* synthetic */ Object b(Class cls, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "_Impl";
        }
        return a(cls, str);
    }
}
