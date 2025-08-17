package vb;

import java.util.HashSet;
import java.util.Set;

/* renamed from: vb.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17537c extends C17535a {

    /* renamed from: c, reason: collision with root package name */
    private Class<?> f164630c;

    /* renamed from: d, reason: collision with root package name */
    private Set<String> f164631d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17537c(Class<?> cls, String... strArr) {
        super(new Class[0]);
        this.f164630c = cls;
        this.f164631d = new HashSet();
        for (String str : strArr) {
            this.f164631d.add(str);
        }
    }

    @Override // vb.C17535a
    final boolean b(Class<?> cls, String str) {
        if (cls.equals(this.f164630c) && this.f164631d.contains(str)) {
            return true;
        }
        return super.b(cls, str);
    }
}
