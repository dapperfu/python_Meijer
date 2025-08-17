package kotlin;

import java.util.List;
import kotlin.C18138h;
import kotlin.C18151u;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aY\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u0012\u0004\u0012\u00020\t0\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "Ly1/k;", "Ly1/W;", "typefaceRequest", "Ly1/h;", "asyncTypefaceCache", "Ly1/I;", "platformFontLoader", "Lkotlin/Function1;", "", "createDefaultTypeface", "Lkotlin/Pair;", "b", "(Ljava/util/List;Ly1/W;Ly1/h;Ly1/I;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: y1.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18150t {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Pair<List<InterfaceC18141k>, Object> b(List<? extends InterfaceC18141k> list, TypefaceRequest typefaceRequest, C18138h c18138h, InterfaceC18115I interfaceC18115I, Function1<? super TypefaceRequest, ? extends Object> function1) {
        Object objInvoke;
        Object objInvoke2;
        Object objB;
        Object result;
        int size = list.size();
        List listS = null;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC18141k interfaceC18141k = list.get(i10);
            int loadingStrategy = interfaceC18141k.getLoadingStrategy();
            C18151u.Companion companion = C18151u.INSTANCE;
            if (C18151u.e(loadingStrategy, companion.b())) {
                synchronized (c18138h.cacheLock) {
                    try {
                        C18138h.Key key = new C18138h.Key(interfaceC18141k, interfaceC18115I.getCacheKey());
                        C18138h.a aVar = (C18138h.a) c18138h.resultCache.d(key);
                        if (aVar == null) {
                            aVar = (C18138h.a) c18138h.permanentCache.e(key);
                        }
                        if (aVar != null) {
                            objInvoke2 = aVar.getResult();
                        } else {
                            Unit unit = Unit.f142422a;
                            try {
                                objInvoke = interfaceC18115I.c(interfaceC18141k);
                            } catch (Exception unused) {
                                objInvoke = function1.invoke(typefaceRequest);
                            }
                            Object obj = objInvoke;
                            C18138h.f(c18138h, interfaceC18141k, interfaceC18115I, obj, false, 8, null);
                            objInvoke2 = obj;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (objInvoke2 == null) {
                    objInvoke2 = function1.invoke(typefaceRequest);
                }
                return TuplesKt.a(listS, C18155y.a(typefaceRequest.getFontSynthesis(), objInvoke2, interfaceC18141k, typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()));
            }
            if (C18151u.e(loadingStrategy, companion.c())) {
                synchronized (c18138h.cacheLock) {
                    try {
                        C18138h.Key key2 = new C18138h.Key(interfaceC18141k, interfaceC18115I.getCacheKey());
                        C18138h.a aVar2 = (C18138h.a) c18138h.resultCache.d(key2);
                        if (aVar2 == null) {
                            aVar2 = (C18138h.a) c18138h.permanentCache.e(key2);
                        }
                        if (aVar2 != null) {
                            result = aVar2.getResult();
                        } else {
                            Unit unit2 = Unit.f142422a;
                            try {
                                Result.Companion companion2 = Result.INSTANCE;
                                objB = Result.b(interfaceC18115I.c(interfaceC18141k));
                            } catch (Throwable th3) {
                                Result.Companion companion3 = Result.INSTANCE;
                                objB = Result.b(ResultKt.a(th3));
                            }
                            Object obj2 = Result.g(objB) ? null : objB;
                            C18138h.f(c18138h, interfaceC18141k, interfaceC18115I, obj2, false, 8, null);
                            result = obj2;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                if (result != null) {
                    return TuplesKt.a(listS, C18155y.a(typefaceRequest.getFontSynthesis(), result, interfaceC18141k, typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()));
                }
            } else {
                if (!C18151u.e(loadingStrategy, companion.a())) {
                    throw new IllegalStateException("Unknown font type " + interfaceC18141k);
                }
                C18138h.a aVarD = c18138h.d(interfaceC18141k, interfaceC18115I);
                if (aVarD != null) {
                    if (!C18138h.a.e(aVarD.getResult()) && aVarD.getResult() != null) {
                        return TuplesKt.a(listS, C18155y.a(typefaceRequest.getFontSynthesis(), aVarD.getResult(), interfaceC18141k, typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()));
                    }
                } else if (listS == null) {
                    listS = CollectionsKt.s(interfaceC18141k);
                } else {
                    listS.add(interfaceC18141k);
                }
            }
        }
        return TuplesKt.a(listS, function1.invoke(typefaceRequest));
    }
}
