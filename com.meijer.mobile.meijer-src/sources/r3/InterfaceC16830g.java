package r3;

import U3.l;
import U3.r;
import a3.t;
import java.util.Objects;

/* renamed from: r3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC16830g {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC16830g f159195a = new a();

    /* renamed from: r3.g$a */
    class a implements InterfaceC16830g {

        /* renamed from: b, reason: collision with root package name */
        private final U3.h f159196b = new U3.h();

        @Override // r3.InterfaceC16830g
        public boolean a(t tVar) {
            String str = tVar.f44767o;
            return this.f159196b.a(tVar) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
        }

        @Override // r3.InterfaceC16830g
        public l b(t tVar) {
            String str = tVar.f44767o;
            if (str != null) {
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new V3.a(str, tVar.f44747J, 16000L);
                    case "application/cea-708":
                        return new V3.c(tVar.f44747J, tVar.f44770r);
                }
            }
            if (!this.f159196b.a(tVar)) {
                throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
            }
            r rVarC = this.f159196b.c(tVar);
            return new C16825b(rVarC.getClass().getSimpleName() + "Decoder", rVarC);
        }

        a() {
        }
    }

    boolean a(t tVar);

    l b(t tVar);
}
