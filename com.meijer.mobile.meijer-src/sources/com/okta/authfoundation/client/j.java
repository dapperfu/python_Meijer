package com.okta.authfoundation.client;

import Dv.C3136e0;
import Dv.InterfaceC3160z;
import Dv.Z;
import Dv.n0;
import Dv.r0;
import Ev.AbstractC3260b;
import Ev.C3263e;
import Ev.u;
import Qs.p;
import Ss.m;
import Ss.r;
import at.C6295b;
import com.okta.authfoundation.client.j;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.UnknownFieldException;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.d;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 g2\u00020\u0001:\u00021+B\u0097\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u001bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001dB¥\u0001\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u001e\u0010\u0019\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0016\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001a\u0010\"J'\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010,\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010.R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010,\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010.R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u00100\u001a\u0004\b9\u0010:R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b@\u00100\u001a\u0004\b>\u0010?R \u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010=\u0012\u0004\bC\u00100\u001a\u0004\bB\u0010?R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u0010E\u0012\u0004\bH\u00100\u001a\u0004\bF\u0010GR \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bI\u0010J\u0012\u0004\bM\u00100\u001a\u0004\bK\u0010LR \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010N\u0012\u0004\bQ\u00100\u001a\u0004\bO\u0010PR \u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bF\u0010R\u0012\u0004\bT\u00100\u001a\u0004\bD\u0010SR \u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010U\u0012\u0004\bX\u00100\u001a\u0004\bV\u0010WR6\u0010\u0019\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010Y\u0012\u0004\b[\u00100\u001a\u0004\bI\u0010ZR!\u0010`\u001a\u00020\u00078FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bV\u0010\\\u0012\u0004\b_\u00100\u001a\u0004\b]\u0010^R \u0010f\u001a\u00020a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010b\u0012\u0004\be\u00100\u001a\u0004\bc\u0010d¨\u0006h"}, d2 = {"Lcom/okta/authfoundation/client/j;", "", "", "clientId", "defaultScope", "discoveryUrl", "Lkotlin/Function0;", "Lokhttp3/d$a;", "okHttpClientFactory", "Lkotlin/coroutines/CoroutineContext;", "ioDispatcher", "computeDispatcher", "LSs/m;", "clock", "Lat/b;", "eventCoordinator", "Lcom/okta/authfoundation/client/IdTokenValidator;", "idTokenValidator", "Lcom/okta/authfoundation/client/AccessTokenValidator;", "accessTokenValidator", "Lcom/okta/authfoundation/client/DeviceSecretValidator;", "deviceSecretValidator", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "LSs/b;", "cacheFactory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;LSs/m;Lat/b;Lcom/okta/authfoundation/client/IdTokenValidator;Lcom/okta/authfoundation/client/AccessTokenValidator;Lcom/okta/authfoundation/client/DeviceSecretValidator;Lkotlin/jvm/functions/Function1;)V", "issuer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LDv/n0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;LSs/m;Lcom/okta/authfoundation/client/IdTokenValidator;Lcom/okta/authfoundation/client/AccessTokenValidator;Lcom/okta/authfoundation/client/DeviceSecretValidator;Lkotlin/jvm/functions/Function1;LDv/n0;)V", "self", "LCv/d;", "output", "LBv/f;", "serialDesc", "", "u", "(Lcom/okta/authfoundation/client/j;LCv/d;LBv/f;)V", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "getClientId$annotations", "()V", "b", "l", "getDefaultScope$annotations", "c", "n", "getDiscoveryUrl$annotations", "d", "Lkotlin/jvm/functions/Function0;", "getOkHttpClientFactory", "()Lkotlin/jvm/functions/Function0;", "getOkHttpClientFactory$annotations", "e", "Lkotlin/coroutines/CoroutineContext;", "q", "()Lkotlin/coroutines/CoroutineContext;", "getIoDispatcher$annotations", "f", "k", "getComputeDispatcher$annotations", "g", "LSs/m;", "j", "()LSs/m;", "getClock$annotations", "h", "Lat/b;", "o", "()Lat/b;", "getEventCoordinator$annotations", "Lcom/okta/authfoundation/client/IdTokenValidator;", "p", "()Lcom/okta/authfoundation/client/IdTokenValidator;", "getIdTokenValidator$annotations", "Lcom/okta/authfoundation/client/AccessTokenValidator;", "()Lcom/okta/authfoundation/client/AccessTokenValidator;", "getAccessTokenValidator$annotations", "Lcom/okta/authfoundation/client/DeviceSecretValidator;", "m", "()Lcom/okta/authfoundation/client/DeviceSecretValidator;", "getDeviceSecretValidator$annotations", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "getCacheFactory$annotations", "Lkotlin/Lazy;", "s", "()Lokhttp3/d$a;", "getOkHttpClient$annotations", "okHttpClient", "LEv/b;", "LEv/b;", "r", "()LEv/b;", "getJson$annotations", "json", "Companion", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class j {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: o, reason: collision with root package name */
    @JvmField
    private static final zv.b<Object>[] f120696o = {null, null, null, new zv.e(Reflection.b(Function0.class), new Annotation[0]), new zv.e(Reflection.b(CoroutineContext.class), new Annotation[0]), new zv.e(Reflection.b(CoroutineContext.class), new Annotation[0]), new zv.e(Reflection.b(m.class), new Annotation[0]), new zv.e(Reflection.b(IdTokenValidator.class), new Annotation[0]), new zv.e(Reflection.b(AccessTokenValidator.class), new Annotation[0]), new zv.e(Reflection.b(DeviceSecretValidator.class), new Annotation[0]), new zv.e(Reflection.b(Function1.class), new Annotation[0])};

    /* renamed from: p, reason: collision with root package name */
    private static j f120697p;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String clientId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String defaultScope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String discoveryUrl;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function0<d.a> okHttpClientFactory;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext ioDispatcher;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext computeDispatcher;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final m clock;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C6295b eventCoordinator;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final IdTokenValidator idTokenValidator;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final AccessTokenValidator accessTokenValidator;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final DeviceSecretValidator deviceSecretValidator;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Function1<Continuation<? super Ss.b>, Object> cacheFactory;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Lazy okHttpClient;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AbstractC3260b json;

    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/okta/authfoundation/client/OidcConfiguration.$serializer", "LDv/z;", "Lcom/okta/authfoundation/client/j;", "<init>", "()V", "LCv/f;", "encoder", "value", "", "g", "(LCv/f;Lcom/okta/authfoundation/client/j;)V", "LCv/e;", "decoder", "f", "(LCv/e;)Lcom/okta/authfoundation/client/j;", "", "Lzv/b;", "e", "()[Lzv/b;", "LBv/f;", "descriptor", "LBv/f;", "a", "()LBv/f;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Deprecated
    public /* synthetic */ class a implements InterfaceC3160z<j> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f120712a;
        private static final Bv.f descriptor;

        private a() {
        }

        static {
            a aVar = new a();
            f120712a = aVar;
            C3136e0 c3136e0 = new C3136e0("com.okta.authfoundation.client.OidcConfiguration", aVar, 11);
            c3136e0.p("clientId", false);
            c3136e0.p("defaultScope", false);
            c3136e0.p("discoveryUrl", false);
            c3136e0.p("okHttpClientFactory", true);
            c3136e0.p("ioDispatcher", true);
            c3136e0.p("computeDispatcher", true);
            c3136e0.p("clock", true);
            c3136e0.p("idTokenValidator", true);
            c3136e0.p("accessTokenValidator", true);
            c3136e0.p("deviceSecretValidator", true);
            c3136e0.p("cacheFactory", true);
            descriptor = c3136e0;
        }

        @Override // zv.b, zv.h, zv.InterfaceC18555a
        /* renamed from: a */
        public final Bv.f getDescriptor() {
            return descriptor;
        }

        @Override // zv.InterfaceC18555a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final j c(Cv.e decoder) {
            int i10;
            CoroutineContext coroutineContext;
            Function1 function1;
            DeviceSecretValidator deviceSecretValidator;
            AccessTokenValidator accessTokenValidator;
            m mVar;
            IdTokenValidator idTokenValidator;
            CoroutineContext coroutineContext2;
            Function0 function0;
            String str;
            String str2;
            String str3;
            Intrinsics.j(decoder, "decoder");
            Bv.f fVar = descriptor;
            Cv.c cVarB = decoder.b(fVar);
            zv.b[] bVarArr = j.f120696o;
            int i11 = 10;
            int i12 = 8;
            String strQ = null;
            if (cVarB.p()) {
                String strQ2 = cVarB.q(fVar, 0);
                String strQ3 = cVarB.q(fVar, 1);
                String strQ4 = cVarB.q(fVar, 2);
                Function0 function02 = (Function0) cVarB.e(fVar, 3, bVarArr[3], null);
                CoroutineContext coroutineContext3 = (CoroutineContext) cVarB.e(fVar, 4, bVarArr[4], null);
                CoroutineContext coroutineContext4 = (CoroutineContext) cVarB.e(fVar, 5, bVarArr[5], null);
                m mVar2 = (m) cVarB.e(fVar, 6, bVarArr[6], null);
                IdTokenValidator idTokenValidator2 = (IdTokenValidator) cVarB.e(fVar, 7, bVarArr[7], null);
                AccessTokenValidator accessTokenValidator2 = (AccessTokenValidator) cVarB.e(fVar, 8, bVarArr[8], null);
                DeviceSecretValidator deviceSecretValidator2 = (DeviceSecretValidator) cVarB.e(fVar, 9, bVarArr[9], null);
                function1 = (Function1) cVarB.e(fVar, 10, bVarArr[10], null);
                str = strQ2;
                str3 = strQ4;
                i10 = 2047;
                deviceSecretValidator = deviceSecretValidator2;
                idTokenValidator = idTokenValidator2;
                mVar = mVar2;
                coroutineContext = coroutineContext4;
                function0 = function02;
                accessTokenValidator = accessTokenValidator2;
                coroutineContext2 = coroutineContext3;
                str2 = strQ3;
            } else {
                int i13 = 7;
                int i14 = 6;
                int i15 = 5;
                int i16 = 3;
                int i17 = 4;
                boolean z10 = true;
                int i18 = 0;
                CoroutineContext coroutineContext5 = null;
                Function1 function12 = null;
                DeviceSecretValidator deviceSecretValidator3 = null;
                AccessTokenValidator accessTokenValidator3 = null;
                m mVar3 = null;
                IdTokenValidator idTokenValidator3 = null;
                CoroutineContext coroutineContext6 = null;
                Function0 function03 = null;
                String strQ5 = null;
                String strQ6 = null;
                while (z10) {
                    int i19 = i12;
                    int iF = cVarB.f(fVar);
                    switch (iF) {
                        case -1:
                            z10 = false;
                            i11 = 10;
                            i12 = 8;
                            i16 = 3;
                            i17 = 4;
                            i15 = 5;
                            i14 = 6;
                            i13 = 7;
                        case 0:
                            i18 |= 1;
                            strQ = cVarB.q(fVar, 0);
                            i11 = 10;
                            i12 = 8;
                            i16 = 3;
                            i17 = 4;
                            i15 = 5;
                            i14 = 6;
                            i13 = 7;
                        case 1:
                            strQ5 = cVarB.q(fVar, 1);
                            i18 |= 2;
                            i11 = 10;
                            i12 = 8;
                            i16 = 3;
                            i17 = 4;
                            i15 = 5;
                            i14 = 6;
                            i13 = 7;
                        case 2:
                            strQ6 = cVarB.q(fVar, 2);
                            i18 |= 4;
                            i11 = 10;
                            i12 = 8;
                            i17 = 4;
                            i15 = 5;
                            i14 = 6;
                            i13 = 7;
                        case 3:
                            function03 = (Function0) cVarB.e(fVar, i16, bVarArr[i16], function03);
                            i18 |= 8;
                            i11 = 10;
                            i12 = 8;
                            i17 = 4;
                            i15 = 5;
                            i14 = 6;
                            i13 = 7;
                        case 4:
                            coroutineContext6 = (CoroutineContext) cVarB.e(fVar, i17, bVarArr[i17], coroutineContext6);
                            i18 |= 16;
                            i11 = 10;
                            i12 = 8;
                            i15 = 5;
                            i14 = 6;
                            i13 = 7;
                        case 5:
                            coroutineContext5 = (CoroutineContext) cVarB.e(fVar, i15, bVarArr[i15], coroutineContext5);
                            i18 |= 32;
                            i11 = 10;
                            i12 = 8;
                            i14 = 6;
                            i13 = 7;
                        case 6:
                            mVar3 = (m) cVarB.e(fVar, i14, bVarArr[i14], mVar3);
                            i18 |= 64;
                            i11 = 10;
                            i12 = 8;
                            i13 = 7;
                        case 7:
                            idTokenValidator3 = (IdTokenValidator) cVarB.e(fVar, i13, bVarArr[i13], idTokenValidator3);
                            i18 |= 128;
                            i11 = 10;
                            i12 = 8;
                        case 8:
                            accessTokenValidator3 = (AccessTokenValidator) cVarB.e(fVar, i19, bVarArr[i19], accessTokenValidator3);
                            i18 |= 256;
                            i12 = i19;
                            i11 = 10;
                        case 9:
                            deviceSecretValidator3 = (DeviceSecretValidator) cVarB.e(fVar, 9, bVarArr[9], deviceSecretValidator3);
                            i18 |= 512;
                            i12 = i19;
                        case 10:
                            function12 = (Function1) cVarB.e(fVar, i11, bVarArr[i11], function12);
                            i18 |= 1024;
                            i12 = i19;
                        default:
                            throw new UnknownFieldException(iF);
                    }
                }
                i10 = i18;
                coroutineContext = coroutineContext5;
                function1 = function12;
                deviceSecretValidator = deviceSecretValidator3;
                accessTokenValidator = accessTokenValidator3;
                mVar = mVar3;
                idTokenValidator = idTokenValidator3;
                coroutineContext2 = coroutineContext6;
                function0 = function03;
                str = strQ;
                str2 = strQ5;
                str3 = strQ6;
            }
            cVarB.a(fVar);
            return new j(i10, str, str2, str3, function0, coroutineContext2, coroutineContext, mVar, idTokenValidator, accessTokenValidator, deviceSecretValidator, function1, null);
        }

        @Override // zv.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void b(Cv.f encoder, j value) {
            Intrinsics.j(encoder, "encoder");
            Intrinsics.j(value, "value");
            Bv.f fVar = descriptor;
            Cv.d dVarB = encoder.b(fVar);
            j.u(value, dVarB, fVar);
            dVarB.a(fVar);
        }

        @Override // Dv.InterfaceC3160z
        public zv.b<?>[] d() {
            return InterfaceC3160z.a.a(this);
        }

        @Override // Dv.InterfaceC3160z
        public final zv.b<?>[] e() {
            zv.b<?>[] bVarArr = j.f120696o;
            zv.b<?> bVar = bVarArr[3];
            zv.b<?> bVar2 = bVarArr[4];
            zv.b<?> bVar3 = bVarArr[5];
            zv.b<?> bVar4 = bVarArr[6];
            zv.b<?> bVar5 = bVarArr[7];
            zv.b<?> bVar6 = bVarArr[8];
            zv.b<?> bVar7 = bVarArr[9];
            zv.b<?> bVar8 = bVarArr[10];
            r0 r0Var = r0.f6781a;
            return new zv.b[]{r0Var, r0Var, r0Var, bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/okta/authfoundation/client/j$b;", "", "<init>", "()V", "LEv/b;", "b", "()LEv/b;", "Lzv/b;", "Lcom/okta/authfoundation/client/j;", "serializer", "()Lzv/b;", "value", "d", "()Lcom/okta/authfoundation/client/j;", "e", "(Lcom/okta/authfoundation/client/j;)V", "default", "_default", "Lcom/okta/authfoundation/client/j;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.okta.authfoundation.client.j$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(C3263e Json) {
            Intrinsics.j(Json, "$this$Json");
            Json.c(true);
            return Unit.f143329a;
        }

        public final AbstractC3260b b() {
            return u.b(null, new Function1() { // from class: Ss.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return j.Companion.c((C3263e) obj);
                }
            }, 1, null);
        }

        public final void e(j value) {
            Intrinsics.j(value, "value");
            if (j.f120697p != null) {
                throw new IllegalStateException("Attempted setting OidcConfiguration.default after initialization");
            }
            j.f120697p = value;
        }

        public final zv.b<j> serializer() {
            return a.f120712a;
        }

        public final j d() {
            j jVar = j.f120697p;
            if (jVar != null) {
                return jVar;
            }
            throw new IllegalStateException("Attempted to use OidcConfiguration.default without setting it");
        }
    }

    public /* synthetic */ j(int i10, String str, String str2, String str3, Function0 function0, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, m mVar, IdTokenValidator idTokenValidator, AccessTokenValidator accessTokenValidator, DeviceSecretValidator deviceSecretValidator, Function1 function1, n0 n0Var) {
        if (7 != (i10 & 7)) {
            Z.a(i10, 7, a.f120712a.getDescriptor());
        }
        this.clientId = str;
        this.defaultScope = str2;
        this.discoveryUrl = str3;
        if ((i10 & 8) == 0) {
            this.okHttpClientFactory = p.f31427a.E();
        } else {
            this.okHttpClientFactory = function0;
        }
        if ((i10 & 16) == 0) {
            this.ioDispatcher = p.f31427a.C();
        } else {
            this.ioDispatcher = coroutineContext;
        }
        if ((i10 & 32) == 0) {
            this.computeDispatcher = p.f31427a.x();
        } else {
            this.computeDispatcher = coroutineContext2;
        }
        if ((i10 & 64) == 0) {
            this.clock = p.f31427a.w();
        } else {
            this.clock = mVar;
        }
        p pVar = p.f31427a;
        this.eventCoordinator = pVar.A();
        if ((i10 & 128) == 0) {
            this.idTokenValidator = pVar.B();
        } else {
            this.idTokenValidator = idTokenValidator;
        }
        if ((i10 & 256) == 0) {
            this.accessTokenValidator = pVar.u();
        } else {
            this.accessTokenValidator = accessTokenValidator;
        }
        if ((i10 & 512) == 0) {
            this.deviceSecretValidator = pVar.z();
        } else {
            this.deviceSecretValidator = deviceSecretValidator;
        }
        if ((i10 & 1024) == 0) {
            this.cacheFactory = pVar.v();
        } else {
            this.cacheFactory = function1;
        }
        this.okHttpClient = LazyKt.b(new Function0() { // from class: Ss.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.okta.authfoundation.client.j.c(this.f35783a);
            }
        });
        this.json = INSTANCE.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d.a c(j jVar) {
        d.a aVarInvoke = jVar.okHttpClientFactory.invoke();
        if (!(aVarInvoke instanceof OkHttpClient)) {
            return aVarInvoke;
        }
        OkHttpClient okHttpClient = (OkHttpClient) aVarInvoke;
        List<Interceptor> listY = okHttpClient.y();
        OkHttpClient.Builder builderB = okHttpClient.B();
        builderB.R().clear();
        OkHttpClient.Builder builderAddInterceptor = builderB.addInterceptor(r.f35794a);
        builderAddInterceptor.R().addAll(listY);
        return builderAddInterceptor.g(p.f31427a.y()).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d.a t(j jVar) {
        d.a aVarInvoke = jVar.okHttpClientFactory.invoke();
        if (!(aVarInvoke instanceof OkHttpClient)) {
            return aVarInvoke;
        }
        OkHttpClient okHttpClient = (OkHttpClient) aVarInvoke;
        List<Interceptor> listY = okHttpClient.y();
        OkHttpClient.Builder builderB = okHttpClient.B();
        builderB.R().clear();
        OkHttpClient.Builder builderAddInterceptor = builderB.addInterceptor(r.f35794a);
        builderAddInterceptor.R().addAll(listY);
        return builderAddInterceptor.g(p.f31427a.y()).a();
    }

    @JvmStatic
    public static final /* synthetic */ void u(j self, Cv.d output, Bv.f serialDesc) {
        zv.b<Object>[] bVarArr = f120696o;
        output.o(serialDesc, 0, self.clientId);
        output.o(serialDesc, 1, self.defaultScope);
        output.o(serialDesc, 2, self.discoveryUrl);
        if (output.z(serialDesc, 3) || !Intrinsics.e(self.okHttpClientFactory, p.f31427a.E())) {
            output.l(serialDesc, 3, bVarArr[3], self.okHttpClientFactory);
        }
        if (output.z(serialDesc, 4) || !Intrinsics.e(self.ioDispatcher, p.f31427a.C())) {
            output.l(serialDesc, 4, bVarArr[4], self.ioDispatcher);
        }
        if (output.z(serialDesc, 5) || !Intrinsics.e(self.computeDispatcher, p.f31427a.x())) {
            output.l(serialDesc, 5, bVarArr[5], self.computeDispatcher);
        }
        if (output.z(serialDesc, 6) || !Intrinsics.e(self.clock, p.f31427a.w())) {
            output.l(serialDesc, 6, bVarArr[6], self.clock);
        }
        if (output.z(serialDesc, 7) || !Intrinsics.e(self.idTokenValidator, p.f31427a.B())) {
            output.l(serialDesc, 7, bVarArr[7], self.idTokenValidator);
        }
        if (output.z(serialDesc, 8) || !Intrinsics.e(self.accessTokenValidator, p.f31427a.u())) {
            output.l(serialDesc, 8, bVarArr[8], self.accessTokenValidator);
        }
        if (output.z(serialDesc, 9) || !Intrinsics.e(self.deviceSecretValidator, p.f31427a.z())) {
            output.l(serialDesc, 9, bVarArr[9], self.deviceSecretValidator);
        }
        if (!output.z(serialDesc, 10) && Intrinsics.e(self.cacheFactory, p.f31427a.v())) {
            return;
        }
        output.l(serialDesc, 10, bVarArr[10], self.cacheFactory);
    }

    /* renamed from: g, reason: from getter */
    public final AccessTokenValidator getAccessTokenValidator() {
        return this.accessTokenValidator;
    }

    public final Function1<Continuation<? super Ss.b>, Object> h() {
        return this.cacheFactory;
    }

    /* renamed from: i, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* renamed from: j, reason: from getter */
    public final m getClock() {
        return this.clock;
    }

    /* renamed from: k, reason: from getter */
    public final CoroutineContext getComputeDispatcher() {
        return this.computeDispatcher;
    }

    /* renamed from: l, reason: from getter */
    public final String getDefaultScope() {
        return this.defaultScope;
    }

    /* renamed from: m, reason: from getter */
    public final DeviceSecretValidator getDeviceSecretValidator() {
        return this.deviceSecretValidator;
    }

    /* renamed from: n, reason: from getter */
    public final String getDiscoveryUrl() {
        return this.discoveryUrl;
    }

    /* renamed from: o, reason: from getter */
    public final C6295b getEventCoordinator() {
        return this.eventCoordinator;
    }

    /* renamed from: p, reason: from getter */
    public final IdTokenValidator getIdTokenValidator() {
        return this.idTokenValidator;
    }

    /* renamed from: q, reason: from getter */
    public final CoroutineContext getIoDispatcher() {
        return this.ioDispatcher;
    }

    /* renamed from: r, reason: from getter */
    public final AbstractC3260b getJson() {
        return this.json;
    }

    public final d.a s() {
        return (d.a) this.okHttpClient.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private j(String str, String str2, String str3, Function0<? extends d.a> function0, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, m mVar, C6295b c6295b, IdTokenValidator idTokenValidator, AccessTokenValidator accessTokenValidator, DeviceSecretValidator deviceSecretValidator, Function1<? super Continuation<? super Ss.b>, ? extends Object> function1) {
        this.clientId = str;
        this.defaultScope = str2;
        this.discoveryUrl = str3;
        this.okHttpClientFactory = function0;
        this.ioDispatcher = coroutineContext;
        this.computeDispatcher = coroutineContext2;
        this.clock = mVar;
        this.eventCoordinator = c6295b;
        this.idTokenValidator = idTokenValidator;
        this.accessTokenValidator = accessTokenValidator;
        this.deviceSecretValidator = deviceSecretValidator;
        this.cacheFactory = function1;
        this.okHttpClient = LazyKt.b(new Function0() { // from class: Ss.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.okta.authfoundation.client.j.t(this.f35784a);
            }
        });
        this.json = INSTANCE.b();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j(String clientId, String defaultScope, String issuer) {
        Intrinsics.j(clientId, "clientId");
        Intrinsics.j(defaultScope, "defaultScope");
        Intrinsics.j(issuer, "issuer");
        p pVar = p.f31427a;
        this(clientId, defaultScope, issuer + "/.well-known/openid-configuration", pVar.E(), pVar.C(), pVar.x(), pVar.w(), pVar.A(), pVar.B(), pVar.u(), pVar.z(), pVar.v());
    }
}
