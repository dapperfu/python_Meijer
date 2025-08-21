package Db;

import com.gimbal.internal.json.JsonWriteException;
import eb.C13786c;
import eb.C13787d;
import xb.C18150d;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    private static final C13786c f6092b = C13787d.a(i.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final C18150d f6093a;

    public final <T> T a(String str, Class<T> cls) {
        try {
            return (T) this.f6093a.c(cls, str);
        } catch (Exception e10) {
            f6092b.g(e10.getMessage(), new Object[0]);
            return null;
        }
    }

    public final String b(Object obj) throws JsonWriteException {
        return this.f6093a.h(obj);
    }

    public i(C18150d c18150d) {
        this.f6093a = c18150d;
    }
}
