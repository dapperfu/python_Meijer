package vb;

import cb.C6380a;
import cb.C6381b;
import com.gimbal.internal.json.JsonReadException;
import com.gimbal.internal.json.JsonWriteException;
import com.google.maps.android.BuildConfig;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: vb.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17538d {

    /* renamed from: c, reason: collision with root package name */
    private static final C6380a f164632c = C6381b.a(C17538d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final C17540f f164633a;

    /* renamed from: b, reason: collision with root package name */
    private final C17541g f164634b;

    public C17538d() {
        this(true);
    }

    private C17538d(boolean z10) {
        this.f164633a = new C17540f(z10);
        this.f164634b = new C17541g(z10);
    }

    public static String e(Object obj, int i10) {
        if (obj == null) {
            return BuildConfig.TRAVIS;
        }
        try {
            C17538d c17538d = new C17538d(false);
            if (!obj.getClass().isArray() && !(obj instanceof Collection)) {
                if (!(obj instanceof CharSequence) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Enum)) {
                    JSONObject jSONObjectG = c17538d.g(obj);
                    return i10 > 0 ? jSONObjectG.toString(i10) : jSONObjectG.toString();
                }
                return c17538d.h(obj);
            }
            JSONArray jSONArrayF = c17538d.f(obj);
            return i10 > 0 ? jSONArrayF.toString(i10) : jSONArrayF.toString();
        } catch (Exception e10) {
            e10.getMessage();
            return "-- toString() Failed --  " + obj.getClass().getName();
        }
    }

    public void a(C17535a c17535a, Class<?>... clsArr) {
        this.f164633a.d(c17535a, clsArr);
        this.f164634b.d(c17535a, clsArr);
    }

    public void b(AbstractC17543i abstractC17543i, Class<?>... clsArr) {
        this.f164633a.e(abstractC17543i, clsArr);
        this.f164634b.e(abstractC17543i, clsArr);
    }

    public <X> X c(Class<X> cls, String str) throws JsonReadException {
        return (X) this.f164633a.w(cls, str);
    }

    public <X> X d(Class<X> cls, byte[] bArr) throws JsonReadException {
        return (X) this.f164633a.w(cls, new String(bArr));
    }

    public JSONArray f(Object obj) throws JsonWriteException {
        return this.f164634b.l(obj);
    }

    public JSONObject g(Object obj) throws JsonWriteException {
        return this.f164634b.m(obj);
    }

    public String h(Object obj) throws JsonWriteException {
        return this.f164634b.n(obj);
    }
}
