package com.radiusnetworks.flybuy.sdk.util;

import com.fullstory.FS;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import j$.net.URLDecoder;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0002H\u0080@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0004H\u0080@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a\u0018\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007*\u00020\u0002H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"getRedirectUrl", "Lkotlin/Result;", "Ljava/net/URL;", "(Ljava/net/URL;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryParameters", "", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UrlExtensionKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt", f = "UrlExtension.kt", l = {9}, m = "getRedirectUrl")
    /* renamed from: com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt$getRedirectUrl$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object redirectUrl = UrlExtensionKt.getRedirectUrl((String) null, this);
            return redirectUrl == IntrinsicsKt.f() ? redirectUrl : Result.a(redirectUrl);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "Lkotlin/Result;", "", "<anonymous>", "(Lqv/O;)Lkotlin/Result;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt$getRedirectUrl$2", f = "UrlExtension.kt", l = {12}, m = "invokeSuspend")
    /* renamed from: com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt$getRedirectUrl$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Result<? extends String>>, Object> {
        final /* synthetic */ String $this_getRedirectUrl;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$this_getRedirectUrl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$this_getRedirectUrl, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Result<? extends String>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super Result<String>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super Result<String>> continuation) {
            return ((AnonymousClass2) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object redirectUrl;
            Object objF = IntrinsicsKt.f();
            int i10 = this.label;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        redirectUrl = ((Result) obj).getValue();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    URL url = new URL(this.$this_getRedirectUrl);
                    Result.Companion companion = Result.INSTANCE;
                    this.label = 1;
                    redirectUrl = UrlExtensionKt.getRedirectUrl(url, this);
                    if (redirectUrl == objF) {
                        return objF;
                    }
                }
                ResultKt.b(redirectUrl);
                objB = Result.b(((URL) redirectUrl).toString());
            } catch (Exception e10) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            return Result.a(objB);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt", f = "UrlExtension.kt", l = {19}, m = "getRedirectUrl")
    /* renamed from: com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt$getRedirectUrl$3, reason: invalid class name */
    public static final class AnonymousClass3 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object redirectUrl = UrlExtensionKt.getRedirectUrl((URL) null, this);
            return redirectUrl == IntrinsicsKt.f() ? redirectUrl : Result.a(redirectUrl);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "Lkotlin/Result;", "Ljava/net/URL;", "<anonymous>", "(Lqv/O;)Lkotlin/Result;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt$getRedirectUrl$4", f = "UrlExtension.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt$getRedirectUrl$4, reason: invalid class name */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Result<? extends URL>>, Object> {
        final /* synthetic */ URL $this_getRedirectUrl;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(URL url, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$this_getRedirectUrl = url;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$this_getRedirectUrl, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Result<? extends URL>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super Result<URL>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super Result<URL>> continuation) {
            return ((AnonymousClass4) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            Object objB;
            URL url;
            IntrinsicsKt.f();
            if (this.label == 0) {
                ResultKt.b(obj);
                try {
                    URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(FS.urlconnection_wrapInstance(this.$this_getRedirectUrl.openConnection()));
                    Intrinsics.h(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                    int responseCode = httpURLConnection.getResponseCode();
                    if (300 <= responseCode && responseCode < 400) {
                        url = new URL(httpURLConnection.getHeaderField("Location"));
                    } else {
                        url = httpURLConnection.getURL();
                    }
                    httpURLConnection.disconnect();
                    objB = Result.b(url);
                } catch (Exception e10) {
                    Result.Companion companion = Result.INSTANCE;
                    objB = Result.b(ResultKt.a(e10));
                }
                return Result.a(objB);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object getRedirectUrl(java.lang.String r5, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.String>> r6) {
        /*
            boolean r0 = r6 instanceof com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt$getRedirectUrl$1 r0 = (com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt$getRedirectUrl$1 r0 = new com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt$getRedirectUrl$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r6)
            qv.K r6 = qv.C16639f0.b()
            com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt$getRedirectUrl$2 r2 = new com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt$getRedirectUrl$2
            r4 = 0
            r2.<init>(r5, r4)
            r0.label = r3
            java.lang.Object r6 = qv.C16644i.g(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.getValue()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt.getRedirectUrl(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object getRedirectUrl(java.net.URL r5, kotlin.coroutines.Continuation<? super kotlin.Result<java.net.URL>> r6) {
        /*
            boolean r0 = r6 instanceof com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt.AnonymousClass3
            if (r0 == 0) goto L13
            r0 = r6
            com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt$getRedirectUrl$3 r0 = (com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt.AnonymousClass3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt$getRedirectUrl$3 r0 = new com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt$getRedirectUrl$3
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r6)
            qv.K r6 = qv.C16639f0.b()
            com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt$getRedirectUrl$4 r2 = new com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt$getRedirectUrl$4
            r4 = 0
            r2.<init>(r5, r4)
            r0.label = r3
            java.lang.Object r6 = qv.C16644i.g(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.getValue()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.util.UrlExtensionKt.getRedirectUrl(java.net.URL, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Map<String, String> queryParameters(URL url) throws UnsupportedEncodingException {
        Intrinsics.j(url, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String query = url.getQuery();
        if (query != null && query.length() > 0) {
            Iterator it = StringsKt.a1(query, new String[]{"&"}, false, 0, 6, null).iterator();
            while (it.hasNext()) {
                List listA1 = StringsKt.a1((String) it.next(), new String[]{"="}, false, 0, 6, null);
                String strDecode = URLDecoder.decode((String) listA1.get(0), "UTF-8");
                String strDecode2 = listA1.size() > 1 ? URLDecoder.decode((String) listA1.get(1), "UTF-8") : "";
                Intrinsics.g(strDecode);
                Intrinsics.g(strDecode2);
                linkedHashMap.put(strDecode, strDecode2);
            }
        }
        return linkedHashMap;
    }
}
