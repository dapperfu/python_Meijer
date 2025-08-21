package xb;

import java.util.HashSet;
import java.util.Set;

/* renamed from: xb.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18149c extends C18147a {

    /* renamed from: c, reason: collision with root package name */
    private Class<?> f170666c;

    /* renamed from: d, reason: collision with root package name */
    private Set<String> f170667d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18149c(Class<?> cls, String... strArr) {
        super(new Class[0]);
        this.f170666c = cls;
        this.f170667d = new HashSet();
        for (String str : strArr) {
            this.f170667d.add(str);
        }
    }

    @Override // xb.C18147a
    final boolean b(Class<?> cls, String str) {
        if (cls.equals(this.f170666c) && this.f170667d.contains(str)) {
            return true;
        }
        return super.b(cls, str);
    }
}
