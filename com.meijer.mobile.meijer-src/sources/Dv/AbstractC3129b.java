package Dv;

import Cv.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.SerializationException;
import zv.InterfaceC18555a;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00192\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LDv/b;", "", "T", "Lzv/b;", "<init>", "()V", "LCv/c;", "compositeDecoder", "g", "(LCv/c;)Ljava/lang/Object;", "LCv/f;", "encoder", "value", "", "b", "(LCv/f;Ljava/lang/Object;)V", "LCv/e;", "decoder", "c", "(LCv/e;)Ljava/lang/Object;", "", "klassName", "Lzv/a;", "h", "(LCv/c;Ljava/lang/String;)Lzv/a;", "Lzv/h;", "i", "(LCv/f;Ljava/lang/Object;)Lzv/h;", "Lkotlin/reflect/KClass;", "j", "()Lkotlin/reflect/KClass;", "baseClass", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Dv.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC3129b<T> implements zv.b<T> {
    public abstract KClass<T> j();

    @Override // zv.h
    public final void b(Cv.f encoder, T value) {
        Intrinsics.j(encoder, "encoder");
        Intrinsics.j(value, "value");
        zv.h<? super T> hVarB = zv.f.b(this, encoder, value);
        Bv.f descriptor = getDescriptor();
        Cv.d dVarB = encoder.b(descriptor);
        dVarB.o(getDescriptor(), 0, hVarB.getDescriptor().getSerialName());
        Bv.f descriptor2 = getDescriptor();
        Intrinsics.h(hVarB, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        dVarB.l(descriptor2, 1, hVarB, value);
        dVarB.a(descriptor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zv.InterfaceC18555a
    public final T c(Cv.e decoder) {
        T t10;
        Intrinsics.j(decoder, "decoder");
        Bv.f descriptor = getDescriptor();
        Cv.c cVarB = decoder.b(descriptor);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (cVarB.p()) {
            t10 = (T) g(cVarB);
        } else {
            Object objC = null;
            while (true) {
                int iF = cVarB.f(getDescriptor());
                if (iF != -1) {
                    if (iF == 0) {
                        objectRef.f143742a = (T) cVarB.q(getDescriptor(), iF);
                    } else {
                        if (iF != 1) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) objectRef.f143742a;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb2.append(str);
                            sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb2.append(iF);
                            throw new SerializationException(sb2.toString());
                        }
                        T t11 = objectRef.f143742a;
                        if (t11 == 0) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                        objectRef.f143742a = t11;
                        objC = c.a.c(cVarB, getDescriptor(), iF, zv.f.a(this, cVarB, (String) t11), null, 8, null);
                    }
                } else {
                    if (objC == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) objectRef.f143742a)).toString());
                    }
                    Intrinsics.h(objC, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                    t10 = (T) objC;
                }
            }
        }
        cVarB.a(descriptor);
        return t10;
    }

    public InterfaceC18555a<T> h(Cv.c decoder, String klassName) {
        Intrinsics.j(decoder, "decoder");
        return decoder.getSerializersModule().d(j(), klassName);
    }

    public zv.h<T> i(Cv.f encoder, T value) {
        Intrinsics.j(encoder, "encoder");
        Intrinsics.j(value, "value");
        return encoder.getSerializersModule().e(j(), value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T g(Cv.c compositeDecoder) {
        return (T) c.a.c(compositeDecoder, getDescriptor(), 1, zv.f.a(this, compositeDecoder, compositeDecoder.q(getDescriptor(), 0)), null, 8, null);
    }
}
