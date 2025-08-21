package o2;

import com.google.maps.android.BuildConfig;

/* loaded from: classes.dex */
public class b {
    public static void a(Object obj, StringBuilder sb2) {
        int iLastIndexOf;
        if (obj == null) {
            sb2.append(BuildConfig.TRAVIS);
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb2.append(simpleName);
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}
