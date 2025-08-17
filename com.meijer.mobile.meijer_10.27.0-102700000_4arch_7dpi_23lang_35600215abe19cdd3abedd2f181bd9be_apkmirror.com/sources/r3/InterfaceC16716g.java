package r3;

import U3.l;
import U3.r;
import a3.t;
import java.util.Objects;

/* renamed from: r3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC16716g {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC16716g f157809a = new a();

    /* renamed from: r3.g$a */
    class a implements InterfaceC16716g {

        /* renamed from: b, reason: collision with root package name */
        private final U3.h f157810b = new U3.h();

        @Override // r3.InterfaceC16716g
        public boolean a(t tVar) {
            String str = tVar.f43949o;
            return this.f157810b.a(tVar) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
        }

        @Override // r3.InterfaceC16716g
        public l b(t tVar) {
            String str = tVar.f43949o;
            if (str != null) {
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new V3.a(str, tVar.f43929J, 16000L);
                    case "application/cea-708":
                        return new V3.c(tVar.f43929J, tVar.f43952r);
                }
            }
            if (!this.f157810b.a(tVar)) {
                throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
            }
            r rVarC = this.f157810b.c(tVar);
            return new C16711b(rVarC.getClass().getSimpleName() + "Decoder", rVarC);
        }

        a() {
        }
    }

    boolean a(t tVar);

    l b(t tVar);
}
