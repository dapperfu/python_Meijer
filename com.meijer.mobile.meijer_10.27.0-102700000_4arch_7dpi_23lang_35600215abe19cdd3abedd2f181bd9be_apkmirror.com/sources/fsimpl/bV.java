package fsimpl;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.fullstory.jni.FSNative;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes14.dex */
public class bV {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f131791d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final C14013ck f131792a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakHashMap f131793b = new WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f131794c = new WeakHashMap();

    public bV(C14013ck c14013ck) {
        this.f131792a = c14013ck;
    }

    private synchronized Integer a(Bitmap bitmap, Integer num) {
        return (Integer) this.f131793b.put(bitmap, num);
    }

    private Integer a(String str) {
        Integer num;
        if (str == null || (num = (Integer) this.f131792a.F().get(str)) == null) {
            return -1;
        }
        return num;
    }

    private Integer b(Bitmap bitmap) {
        return a(eY.identify(bitmap));
    }

    private Integer b(Bitmap bitmap, boolean[] zArr) {
        int iB;
        Integer numC = c(bitmap);
        if (numC != null) {
            return numC;
        }
        if (FSNative.f64361b) {
            if (zArr != null && !zArr[0]) {
                zArr[0] = true;
                bX.a(this);
                Integer numC2 = c(bitmap);
                if (numC2 != null) {
                    return numC2;
                }
            }
            iB = -1;
        } else {
            iB = b(bitmap);
        }
        a(bitmap, iB);
        return iB;
    }

    private synchronized Integer c(Bitmap bitmap) {
        return (Integer) this.f131793b.get(bitmap);
    }

    private synchronized boolean d(Bitmap bitmap) {
        Map map;
        Object obj;
        map = this.f131794c;
        obj = f131791d;
        return map.put(bitmap, obj) != obj;
    }

    public String a(Bitmap bitmap) {
        C14103fu.b("The identifyAssetSha check should NEVER be on the UI thread", new Object[0]);
        Integer numB = b(bitmap, null);
        if (numB.intValue() == -1 || numB.intValue() == -2) {
            return null;
        }
        return (String) this.f131792a.G().get(numB);
    }

    public void a(Resources resources, Bitmap bitmap, long j10) {
        C14103fu.a("The markAsAsset call should always be on the UI thread", new Object[0]);
        if (d(bitmap)) {
            Integer numA = a(bY.a(resources.getAssets(), j10));
            if (numA.intValue() == -1) {
                numA = -2;
            }
            a(bitmap, numA);
        }
    }

    public boolean a(Bitmap bitmap, boolean[] zArr) {
        C14103fu.a("The isAsset check should always be on the UI thread", new Object[0]);
        return b(bitmap, zArr).intValue() != -1;
    }
}
