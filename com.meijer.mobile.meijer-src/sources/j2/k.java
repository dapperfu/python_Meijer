package j2;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    private final LocaleList f139769a;

    @Override // j2.j
    public String a() {
        return this.f139769a.toLanguageTags();
    }

    @Override // j2.j
    public Object b() {
        return this.f139769a;
    }

    public boolean equals(Object obj) {
        return this.f139769a.equals(((j) obj).b());
    }

    @Override // j2.j
    public Locale get(int i10) {
        return this.f139769a.get(i10);
    }

    public int hashCode() {
        return this.f139769a.hashCode();
    }

    @Override // j2.j
    public boolean isEmpty() {
        return this.f139769a.isEmpty();
    }

    @Override // j2.j
    public int size() {
        return this.f139769a.size();
    }

    public String toString() {
        return this.f139769a.toString();
    }

    k(Object obj) {
        this.f139769a = (LocaleList) obj;
    }
}
