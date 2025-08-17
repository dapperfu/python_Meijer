package com.launchdarkly.sdk;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import mg.InterfaceC15616b;

@InterfaceC15616b(UserAttributeTypeAdapter.class)
@Deprecated
/* loaded from: classes7.dex */
public final class UserAttribute implements com.launchdarkly.sdk.json.c {

    /* renamed from: c, reason: collision with root package name */
    public static final UserAttribute f91011c;

    /* renamed from: d, reason: collision with root package name */
    public static final UserAttribute f91012d;

    /* renamed from: e, reason: collision with root package name */
    public static final UserAttribute f91013e;

    /* renamed from: f, reason: collision with root package name */
    public static final UserAttribute f91014f;

    /* renamed from: g, reason: collision with root package name */
    public static final UserAttribute f91015g;

    /* renamed from: h, reason: collision with root package name */
    public static final UserAttribute f91016h;

    /* renamed from: i, reason: collision with root package name */
    public static final UserAttribute f91017i;

    /* renamed from: j, reason: collision with root package name */
    public static final UserAttribute f91018j;

    /* renamed from: k, reason: collision with root package name */
    public static final UserAttribute f91019k;

    /* renamed from: l, reason: collision with root package name */
    static final Map<String, UserAttribute> f91020l;

    /* renamed from: m, reason: collision with root package name */
    static final UserAttribute[] f91021m;

    /* renamed from: a, reason: collision with root package name */
    private final String f91022a;

    /* renamed from: b, reason: collision with root package name */
    final com.launchdarkly.sdk.f<com.launchdarkly.sdk.h, LDValue> f91023b;

    @Deprecated
    static final class UserAttributeTypeAdapter extends TypeAdapter<UserAttribute> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserAttribute read(JsonReader jsonReader) throws IOException {
            if (a.f91024a[jsonReader.peek().ordinal()] == 1) {
                return UserAttribute.a(jsonReader.nextString());
            }
            throw new IllegalStateException("expected string for UserAttribute");
        }

        UserAttributeTypeAdapter() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(JsonWriter jsonWriter, UserAttribute userAttribute) throws IOException {
            jsonWriter.value(userAttribute.b());
        }
    }

    static class b implements com.launchdarkly.sdk.f<com.launchdarkly.sdk.h, LDValue> {
        @Override // com.launchdarkly.sdk.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LDValue apply(com.launchdarkly.sdk.h hVar) {
            return hVar.f91309a;
        }

        b() {
        }
    }

    static class c implements com.launchdarkly.sdk.f<com.launchdarkly.sdk.h, LDValue> {
        @Override // com.launchdarkly.sdk.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LDValue apply(com.launchdarkly.sdk.h hVar) {
            return hVar.f91310b;
        }

        c() {
        }
    }

    static class d implements com.launchdarkly.sdk.f<com.launchdarkly.sdk.h, LDValue> {
        @Override // com.launchdarkly.sdk.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LDValue apply(com.launchdarkly.sdk.h hVar) {
            return hVar.f91311c;
        }

        d() {
        }
    }

    static class e implements com.launchdarkly.sdk.f<com.launchdarkly.sdk.h, LDValue> {
        @Override // com.launchdarkly.sdk.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LDValue apply(com.launchdarkly.sdk.h hVar) {
            return hVar.f91312d;
        }

        e() {
        }
    }

    static class f implements com.launchdarkly.sdk.f<com.launchdarkly.sdk.h, LDValue> {
        @Override // com.launchdarkly.sdk.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LDValue apply(com.launchdarkly.sdk.h hVar) {
            return hVar.f91313e;
        }

        f() {
        }
    }

    static class g implements com.launchdarkly.sdk.f<com.launchdarkly.sdk.h, LDValue> {
        @Override // com.launchdarkly.sdk.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LDValue apply(com.launchdarkly.sdk.h hVar) {
            return hVar.f91314f;
        }

        g() {
        }
    }

    static class h implements com.launchdarkly.sdk.f<com.launchdarkly.sdk.h, LDValue> {
        @Override // com.launchdarkly.sdk.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LDValue apply(com.launchdarkly.sdk.h hVar) {
            return hVar.f91315g;
        }

        h() {
        }
    }

    static class i implements com.launchdarkly.sdk.f<com.launchdarkly.sdk.h, LDValue> {
        @Override // com.launchdarkly.sdk.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LDValue apply(com.launchdarkly.sdk.h hVar) {
            return hVar.f91317i;
        }

        i() {
        }
    }

    static class j implements com.launchdarkly.sdk.f<com.launchdarkly.sdk.h, LDValue> {
        @Override // com.launchdarkly.sdk.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LDValue apply(com.launchdarkly.sdk.h hVar) {
            return LDValue.t(hVar.f91316h);
        }

        j() {
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f91024a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f91024a = iArr;
            try {
                iArr[JsonToken.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static {
        UserAttribute userAttribute = new UserAttribute("key", new b());
        f91011c = userAttribute;
        UserAttribute userAttribute2 = new UserAttribute("ip", new c());
        f91012d = userAttribute2;
        UserAttribute userAttribute3 = new UserAttribute("email", new d());
        f91013e = userAttribute3;
        UserAttribute userAttribute4 = new UserAttribute("name", new e());
        f91014f = userAttribute4;
        UserAttribute userAttribute5 = new UserAttribute("avatar", new f());
        f91015g = userAttribute5;
        UserAttribute userAttribute6 = new UserAttribute("firstName", new g());
        f91016h = userAttribute6;
        UserAttribute userAttribute7 = new UserAttribute("lastName", new h());
        f91017i = userAttribute7;
        UserAttribute userAttribute8 = new UserAttribute(PlaceTypes.COUNTRY, new i());
        f91018j = userAttribute8;
        UserAttribute userAttribute9 = new UserAttribute("anonymous", new j());
        f91019k = userAttribute9;
        f91020l = new HashMap();
        UserAttribute[] userAttributeArr = {userAttribute, userAttribute2, userAttribute3, userAttribute4, userAttribute5, userAttribute6, userAttribute7, userAttribute8, userAttribute9};
        for (int i10 = 0; i10 < 9; i10++) {
            UserAttribute userAttribute10 = userAttributeArr[i10];
            f91020l.put(userAttribute10.b(), userAttribute10);
        }
        f91021m = new UserAttribute[]{f91012d, f91013e, f91014f, f91015g, f91016h, f91017i, f91018j};
    }

    public static UserAttribute a(String str) {
        UserAttribute userAttribute = f91020l.get(str);
        return userAttribute != null ? userAttribute : new UserAttribute(str, null);
    }

    public String b() {
        return this.f91022a;
    }

    public boolean c() {
        return this.f91023b != null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof UserAttribute) {
            UserAttribute userAttribute = (UserAttribute) obj;
            if (!c() && !userAttribute.c()) {
                return this.f91022a.equals(userAttribute.f91022a);
            }
            if (this == userAttribute) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return this.f91022a;
    }

    private UserAttribute(String str, com.launchdarkly.sdk.f<com.launchdarkly.sdk.h, LDValue> fVar) {
        this.f91022a = str;
        this.f91023b = fVar;
    }

    public int hashCode() {
        if (c()) {
            return super.hashCode();
        }
        return this.f91022a.hashCode();
    }
}
