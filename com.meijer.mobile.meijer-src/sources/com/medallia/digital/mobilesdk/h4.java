package com.medallia.digital.mobilesdk;

import androidx.recyclerview.widget.RecyclerView;
import com.medallia.digital.mobilesdk.MDExternalError;

/* loaded from: classes8.dex */
class h4 extends a3 {

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class a {

        /* renamed from: A, reason: collision with root package name */
        public static final a f92958A;

        /* renamed from: B, reason: collision with root package name */
        public static final a f92959B;

        /* renamed from: C, reason: collision with root package name */
        public static final a f92960C;

        /* renamed from: D, reason: collision with root package name */
        public static final a f92961D;

        /* renamed from: E, reason: collision with root package name */
        public static final a f92962E;

        /* renamed from: F, reason: collision with root package name */
        public static final a f92963F;

        /* renamed from: G, reason: collision with root package name */
        public static final a f92964G;

        /* renamed from: H, reason: collision with root package name */
        public static final a f92965H;

        /* renamed from: I, reason: collision with root package name */
        public static final a f92966I;

        /* renamed from: J, reason: collision with root package name */
        public static final a f92967J;

        /* renamed from: K, reason: collision with root package name */
        public static final a f92968K;

        /* renamed from: L, reason: collision with root package name */
        public static final a f92969L;

        /* renamed from: M, reason: collision with root package name */
        public static final a f92970M;

        /* renamed from: N, reason: collision with root package name */
        public static final a f92971N;

        /* renamed from: O, reason: collision with root package name */
        public static final a f92972O;

        /* renamed from: P, reason: collision with root package name */
        public static final a f92973P;

        /* renamed from: Q, reason: collision with root package name */
        public static final a f92974Q;

        /* renamed from: R, reason: collision with root package name */
        public static final a f92975R;

        /* renamed from: S, reason: collision with root package name */
        public static final a f92976S;

        /* renamed from: T, reason: collision with root package name */
        public static final a f92977T;

        /* renamed from: U, reason: collision with root package name */
        public static final a f92978U;

        /* renamed from: V, reason: collision with root package name */
        public static final a f92979V;

        /* renamed from: W, reason: collision with root package name */
        public static final a f92980W;

        /* renamed from: X, reason: collision with root package name */
        public static final a f92981X;

        /* renamed from: Y, reason: collision with root package name */
        public static final a f92982Y;

        /* renamed from: Z, reason: collision with root package name */
        public static final a f92983Z;

        /* renamed from: a0, reason: collision with root package name */
        public static final a f92984a0;

        /* renamed from: b0, reason: collision with root package name */
        public static final a f92985b0;

        /* renamed from: c0, reason: collision with root package name */
        public static final a f92986c0;

        /* renamed from: d, reason: collision with root package name */
        public static final a f92987d;

        /* renamed from: d0, reason: collision with root package name */
        public static final a f92988d0;

        /* renamed from: e, reason: collision with root package name */
        public static final a f92989e;

        /* renamed from: e0, reason: collision with root package name */
        public static final a f92990e0;

        /* renamed from: f, reason: collision with root package name */
        public static final a f92991f;

        /* renamed from: f0, reason: collision with root package name */
        public static final a f92992f0;

        /* renamed from: g, reason: collision with root package name */
        public static final a f92993g;

        /* renamed from: g0, reason: collision with root package name */
        public static final a f92994g0;

        /* renamed from: h, reason: collision with root package name */
        public static final a f92995h;

        /* renamed from: h0, reason: collision with root package name */
        private static final /* synthetic */ a[] f92996h0;

        /* renamed from: i, reason: collision with root package name */
        public static final a f92997i;

        /* renamed from: j, reason: collision with root package name */
        public static final a f92998j;

        /* renamed from: k, reason: collision with root package name */
        public static final a f92999k;

        /* renamed from: l, reason: collision with root package name */
        public static final a f93000l;

        /* renamed from: m, reason: collision with root package name */
        public static final a f93001m;

        /* renamed from: n, reason: collision with root package name */
        public static final a f93002n;

        /* renamed from: o, reason: collision with root package name */
        public static final a f93003o;

        /* renamed from: p, reason: collision with root package name */
        public static final a f93004p;

        /* renamed from: q, reason: collision with root package name */
        public static final a f93005q;

        /* renamed from: r, reason: collision with root package name */
        public static final a f93006r;

        /* renamed from: s, reason: collision with root package name */
        public static final a f93007s;

        /* renamed from: t, reason: collision with root package name */
        public static final a f93008t;

        /* renamed from: u, reason: collision with root package name */
        public static final a f93009u;

        /* renamed from: v, reason: collision with root package name */
        public static final a f93010v;

        /* renamed from: w, reason: collision with root package name */
        public static final a f93011w;

        /* renamed from: x, reason: collision with root package name */
        public static final a f93012x;

        /* renamed from: y, reason: collision with root package name */
        public static final a f93013y;

        /* renamed from: z, reason: collision with root package name */
        public static final a f93014z;

        /* renamed from: a, reason: collision with root package name */
        private final int f93015a;

        /* renamed from: b, reason: collision with root package name */
        private final String f93016b;

        /* renamed from: c, reason: collision with root package name */
        private final MDExternalError.ExternalError f93017c;

        static {
            MDExternalError.ExternalError externalError = MDExternalError.ExternalError.API_TOKEN_NOT_VALID;
            a aVar = new a("API_TOKEN_PARSE_ERROR", 0, 2001, externalError, "Could not parse ApiToken");
            f92987d = aVar;
            MDExternalError.ExternalError externalError2 = MDExternalError.ExternalError.AUTHORIZATION_FAILED_20;
            a aVar2 = new a("API_TOKEN_PROPERTY_ID_NO_DATA", 1, 2002, externalError2, "Property id is missing");
            f92989e = aVar2;
            a aVar3 = new a("API_TOKEN_TOKEN_FIELD_NO_DATA", 2, 2003, externalError2, "Token data is missing");
            f92991f = aVar3;
            a aVar4 = new a("EMPTY_AUTH_GW", 3, 2004, externalError2, "Auth url is missing");
            f92993g = aVar4;
            a aVar5 = new a("EMPTY_AUTH_GW_1", 4, 20041, MDExternalError.ExternalError.AUTHORIZATION_FAILED_17, "Auth url is missing");
            f92995h = aVar5;
            a aVar6 = new a("AUTH_NETWORK_ERROR", 5, 2005, MDExternalError.ExternalError.NO_INTERNET_CONNECTION_AVAILABLE, "Authenticate network error");
            f92997i = aVar6;
            a aVar7 = new a("AUTH_NETWORK_ERROR_1", 6, 20051, MDExternalError.ExternalError.NO_INTERNET_CONNECTION_AVAILABLE_11, "Authenticate network error");
            f92998j = aVar7;
            MDExternalError.ExternalError externalError3 = MDExternalError.ExternalError.REQUEST_TIMEOUT;
            a aVar8 = new a("AUTH_TIMEOUT", 7, 2006, externalError3, "Authenticate timeout error");
            f92999k = aVar8;
            a aVar9 = new a("API_TOKEN_EMPTY", 8, 2007, externalError, "Api token is empty");
            f93000l = aVar9;
            a aVar10 = new a("ACCESS_TOKEN_PARSE_LOCAL", 9, 2020, MDExternalError.ExternalError.AUTHORIZATION_FAILED_18, "Could not parse AccessToken");
            f93001m = aVar10;
            a aVar11 = new a("ACCESS_TOKEN_PARSE", 10, 2021, MDExternalError.ExternalError.AUTHORIZATION_FAILED_19, "Could not parse AccessToken");
            f93002n = aVar11;
            a aVar12 = new a("GET_CONFIG_EMPTY_ENDPOINT", 11, 2022, externalError2, "Get config url is missing");
            f93003o = aVar12;
            a aVar13 = new a("ACCESS_PROPERTY_ID_NO_DATA", 12, 2023, externalError2, "Property id is missing");
            f93004p = aVar13;
            a aVar14 = new a("CREATION_DATE_NO_DATA", 13, 2024, externalError2, "Create time is missing");
            f93005q = aVar14;
            a aVar15 = new a("TTL_NO_DATA", 14, 2025, externalError2, "Ttl is missing");
            f93006r = aVar15;
            a aVar16 = new a("ACCESS_TOKEN_TOKEN_FIELD_NO_DATA", 15, 2026, externalError2, "Token data is missing");
            f93007s = aVar16;
            a aVar17 = new a("ACCESS_TOKEN_EMPTY", 16, 2027, externalError, "Access token is empty");
            f93008t = aVar17;
            a aVar18 = new a("UUID_EMPTY", 17, 2028, null, "UUID is empty");
            f93009u = aVar18;
            a aVar19 = new a("RESOURCE_EMPTY_ENDPOINT", 18, 2029, null, "Resource endpoint is missing");
            f93010v = aVar19;
            MDExternalError.ExternalError externalError4 = MDExternalError.ExternalError.SERVER_COM_ERROR;
            a aVar20 = new a("GET_CONFIG_ERROR", 19, 2041, externalError4, "Get configuration error");
            f93011w = aVar20;
            a aVar21 = new a("CONFIGURATION_TIMEOUT", 20, 2042, externalError3, "Configuration timeout");
            f93012x = aVar21;
            a aVar22 = new a("CONFIGURATION", 21, 2043, externalError4, "Could not create configuration");
            f93013y = aVar22;
            a aVar23 = new a("EMPTY_CONFIGURATION", 22, 2044, externalError4, "Configuration is empty");
            f93014z = aVar23;
            a aVar24 = new a("LOCAL_CONFIGURATION_IS_NOT_AVAILABLE", 23, 2045, MDExternalError.ExternalError.UNSPECIFIED_CONFIGURATION_ERROR_13, "Local configuration file is not available");
            f92958A = aVar24;
            a aVar25 = new a("LOCAL_CONFIGURATION_TS_IS_NOT_AVAILABLE", 24, 2046, MDExternalError.ExternalError.UNSPECIFIED_CONFIGURATION_ERROR_14, "Local configuration timestamp is not available");
            f92959B = aVar25;
            a aVar26 = new a("LOCAL_CONFIGURATION_IS_EXPIRED", 25, 2047, MDExternalError.ExternalError.UNSPECIFIED_CONFIGURATION_ERROR_15, "Local configuration is expired");
            f92960C = aVar26;
            a aVar27 = new a("REMOTE_CONFIGURATION_AUTH_FAILED", 26, RecyclerView.m.FLAG_MOVED, MDExternalError.ExternalError.UNSPECIFIED_CONFIGURATION_ERROR_16, "Remote configuration authentication failed");
            f92961D = aVar27;
            a aVar28 = new a("REMOTE_CONFIGURATION_IS_CORRUPTED", 27, 2049, null, "Remote configuration is corrupted or not available");
            f92962E = aVar28;
            a aVar29 = new a("SUBMIT_FEEDBACK_ERROR", 28, 2161, null, "Submit feedback error");
            f92963F = aVar29;
            a aVar30 = new a("FEEDBACK_TIMEOUT", 29, 2162, externalError3, "Feedback timeout");
            f92964G = aVar30;
            a aVar31 = new a("FEEDBACK_PARSE_ERROR", 30, 2163, null, "Could not parse feedback");
            f92965H = aVar31;
            a aVar32 = new a("SUBMIT_FEEDBACK_EMPTY_ENDPOINT", 31, 2164, null, "Empty submit feedback endpoint");
            f92966I = aVar32;
            a aVar33 = new a("EMPTY_FEEDBACK", 32, 2165, null, "Feedback contains no data");
            f92967J = aVar33;
            a aVar34 = new a("DESERIALIZE_FEEDBACK", 33, 2166, null, "Deserialize Feedback failed");
            f92968K = aVar34;
            a aVar35 = new a("DESERIALIZE_FEEDBACK_PAYLOAD", 34, 2167, null, "Deserialize Feedback payload failed");
            f92969L = aVar35;
            a aVar36 = new a("SUBMIT_ANALYTICS_ERROR", 35, 2171, null, "Submit analytics error");
            f92970M = aVar36;
            a aVar37 = new a("SUBMIT_ANALYTICS_EMPTY_ENDPOINT", 36, 2172, null, "Empty submit analytics endpoint");
            f92971N = aVar37;
            a aVar38 = new a("SUBMIT_ANALYTICS_ABOVE_MAX_SIZE", 37, 2173, null, "Analytics elements is above max size element");
            f92972O = aVar38;
            a aVar39 = new a("SUBMIT_DIGITAL_ANALYTICS_ERROR", 38, 2174, null, "Submit digital analytics error");
            f92973P = aVar39;
            a aVar40 = new a("SUBMIT_DIGITAL_ANALYTICS_EMPTY_ENDPOINT", 39, 2175, null, "Empty submit digital analytics endpoint");
            f92974Q = aVar40;
            a aVar41 = new a("GET_RESOURCE_ERROR", 40, 2181, null, "Get resource failed");
            f92975R = aVar41;
            a aVar42 = new a("GET_RESOURCE_TIMEOUT", 41, 2182, externalError3, "Get resource timeout");
            f92976S = aVar42;
            a aVar43 = new a("NO_INTERNET_CONNECTION_AVAILABLE", 42, 2183, MDExternalError.ExternalError.NO_INTERNET_CONNECTION_AVAILABLE_13, "Internet connection is not available");
            f92977T = aVar43;
            a aVar44 = new a("LL_GET_PRESIGNED_URL_ERROR", 43, 2401, null, "LL get presigned Url error");
            f92978U = aVar44;
            a aVar45 = new a("LL_UPLOADING_MEDIA_ERROR", 44, 2402, null, "LL uploading media error");
            f92979V = aVar45;
            a aVar46 = new a("LL_PROCESSING_MEDIA_ERROR", 45, 2403, null, "LL processing media error");
            f92980W = aVar46;
            a aVar47 = new a("LL_PROCESSING_MEDIA_END_POINT", 46, 2404, null, "Empty process media endpoint");
            f92981X = aVar47;
            a aVar48 = new a("LL_EMPTY_MEDIA_DATA_OBJECT", 47, 2405, null, "Empty media data object");
            f92982Y = aVar48;
            a aVar49 = new a("LL_SUBMIT_MEDIA_FEEDBACK_FAILED", 48, 2406, null, "Submit media feedback failed");
            f92983Z = aVar49;
            a aVar50 = new a("SUBMIT_MEDIA_FEEDBACK_EMPTY_ENDPOINT", 49, 2407, null, "Submit media feedback empty endpoint");
            f92984a0 = aVar50;
            a aVar51 = new a("LL_NO_CONNECTION_AVAILABLE", 50, 2408, null, "Error no Connection Available");
            f92985b0 = aVar51;
            a aVar52 = new a("QUARANTINE_VALIDATION_ERROR", 51, 2501, null, "Quarantine Validation Error");
            f92986c0 = aVar52;
            a aVar53 = new a("QUARANTINE_VALIDATION_EMPTY_ENDPOINT", 52, 2502, null, "Quarantine Validation Empty Endpoint Error");
            f92988d0 = aVar53;
            a aVar54 = new a("QUARANTINE_VALIDATION_TIMEOUT", 53, 2503, null, "Quarantine Validation TIMEOUT");
            f92990e0 = aVar54;
            a aVar55 = new a("QUARANTINE_C_UUID_EMPTY_ENDPOINT", 54, 2504, null, "Quarantine CUUID Empty Endpoint Error");
            f92992f0 = aVar55;
            a aVar56 = new a("QUARANTINE_NETWORK_ERROR", 55, 2505, MDExternalError.ExternalError.NO_INTERNET_CONNECTION_AVAILABLE_14, "Internet connection is not available");
            f92994g0 = aVar56;
            f92996h0 = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30, aVar31, aVar32, aVar33, aVar34, aVar35, aVar36, aVar37, aVar38, aVar39, aVar40, aVar41, aVar42, aVar43, aVar44, aVar45, aVar46, aVar47, aVar48, aVar49, aVar50, aVar51, aVar52, aVar53, aVar54, aVar55, aVar56};
        }

        private a(String str, int i10, int i11, MDExternalError.ExternalError externalError, String str2) {
            this.f93015a = i11;
            this.f93016b = str2;
            this.f93017c = externalError;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f92996h0.clone();
        }

        public int a() {
            return this.f93015a;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f93016b;
        }

        public String b() {
            return this.f93016b;
        }
    }

    protected h4(a aVar) {
        super(aVar.f93015a, aVar.f93017c, aVar.f93016b);
    }
}
