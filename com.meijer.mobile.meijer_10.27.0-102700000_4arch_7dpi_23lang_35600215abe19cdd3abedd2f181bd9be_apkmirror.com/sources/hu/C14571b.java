package hu;

import iu.C14761a;
import java.io.File;
import ju.InterfaceC15077a;

/* renamed from: hu.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14571b {

    /* renamed from: a, reason: collision with root package name */
    final iu.d f136247a;

    /* renamed from: b, reason: collision with root package name */
    private final C14761a f136248b;

    /* renamed from: hu.b$a */
    class a implements iu.d {
        a() {
        }
    }

    public C14571b(File file, long j10) {
        this(file, j10, InterfaceC15077a.f141060a);
    }

    C14571b(File file, long j10, InterfaceC15077a interfaceC15077a) {
        this.f136247a = new a();
        this.f136248b = C14761a.j(interfaceC15077a, file, 201105, 2, j10);
    }
}
