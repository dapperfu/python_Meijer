package com.okta.authfoundation.credential.storage;

import Ev.C;
import android.database.Cursor;
import androidx.room.AbstractC6264h;
import androidx.room.AbstractC6266j;
import androidx.room.C6260d;
import androidx.room.G;
import androidx.room.N;
import com.okta.authfoundation.credential.storage.TokenEntity;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import w4.C17823a;
import w4.C17824b;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0014\u001a\u00020\u000f2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u0013\"\u00020\rH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u0016H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'¨\u0006*"}, d2 = {"Lcom/okta/authfoundation/credential/storage/a;", "LXs/a;", "Landroidx/room/G;", "__db", "<init>", "(Landroidx/room/G;)V", "Lcom/okta/authfoundation/credential/storage/TokenEntity$a;", "_value", "", "f", "(Lcom/okta/authfoundation/credential/storage/TokenEntity$a;)Ljava/lang/String;", "g", "(Ljava/lang/String;)Lcom/okta/authfoundation/credential/storage/TokenEntity$a;", "Lcom/okta/authfoundation/credential/storage/TokenEntity;", "tokenEntity", "", "b", "(Lcom/okta/authfoundation/credential/storage/TokenEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "", "c", "([Lcom/okta/authfoundation/credential/storage/TokenEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "d", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", PreferencesHelper.PREF_ID, "e", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/room/G;", "Landroidx/room/j;", "Landroidx/room/j;", "__insertionAdapterOfTokenEntity", "LZs/b;", "LZs/b;", "__stringStringMapTypeConverter", "LZs/a;", "LZs/a;", "__jsonObjectTypeConverter", "Landroidx/room/h;", "Landroidx/room/h;", "__deletionAdapterOfTokenEntity", "__updateAdapterOfTokenEntity", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements Xs.a {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final G __db;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6266j<TokenEntity> __insertionAdapterOfTokenEntity;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Zs.b __stringStringMapTypeConverter;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Zs.a __jsonObjectTypeConverter;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6264h<TokenEntity> __deletionAdapterOfTokenEntity;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6264h<TokenEntity> __updateAdapterOfTokenEntity;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/okta/authfoundation/credential/storage/a$a", "Landroidx/room/j;", "Lcom/okta/authfoundation/credential/storage/TokenEntity;", "", "createQuery", "()Ljava/lang/String;", "LB4/g;", "statement", "entity", "", "b", "(LB4/g;Lcom/okta/authfoundation/credential/storage/TokenEntity;)V", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.okta.authfoundation.credential.storage.a$a, reason: collision with other inner class name */
    public static final class C1975a extends AbstractC6266j<TokenEntity> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a f120760a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1975a(G g10, a aVar) {
            super(g10);
            this.f120760a = aVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC6266j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(B4.g statement, TokenEntity entity) {
            Intrinsics.j(statement, "statement");
            Intrinsics.j(entity, "entity");
            statement.S1(1, entity.getId());
            statement.y2(2, entity.getEncryptedToken());
            String strA = this.f120760a.__stringStringMapTypeConverter.a(entity.j());
            if (strA == null) {
                statement.I(3);
            } else {
                statement.S1(3, strA);
            }
            String strA2 = this.f120760a.__jsonObjectTypeConverter.a(entity.getPayloadData());
            if (strA2 == null) {
                statement.I(4);
            } else {
                statement.S1(4, strA2);
            }
            statement.S1(5, entity.getKeyAlias());
            statement.S1(6, this.f120760a.f(entity.getTokenEncryptionType()));
            if (entity.getBiometricTimeout() == null) {
                statement.I(7);
            } else {
                statement.C(7, r0.intValue());
            }
            String strA3 = this.f120760a.__stringStringMapTypeConverter.a(entity.e());
            if (strA3 == null) {
                statement.I(8);
            } else {
                statement.S1(8, strA3);
            }
        }

        @Override // androidx.room.S
        protected String createQuery() {
            return "INSERT OR ABORT INTO `TokenEntity` (`id`,`encryptedToken`,`tags`,`payloadData`,`keyAlias`,`tokenEncryptionType`,`biometricTimeout`,`encryptionExtras`) VALUES (?,?,?,?,?,?,?,?)";
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/okta/authfoundation/credential/storage/a$b", "Landroidx/room/h;", "Lcom/okta/authfoundation/credential/storage/TokenEntity;", "", "createQuery", "()Ljava/lang/String;", "LB4/g;", "statement", "entity", "", "b", "(LB4/g;Lcom/okta/authfoundation/credential/storage/TokenEntity;)V", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends AbstractC6264h<TokenEntity> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC6264h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(B4.g statement, TokenEntity entity) {
            Intrinsics.j(statement, "statement");
            Intrinsics.j(entity, "entity");
            statement.S1(1, entity.getId());
        }

        @Override // androidx.room.AbstractC6264h, androidx.room.S
        protected String createQuery() {
            return "DELETE FROM `TokenEntity` WHERE `id` = ?";
        }

        b(G g10) {
            super(g10);
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/okta/authfoundation/credential/storage/a$c", "Landroidx/room/h;", "Lcom/okta/authfoundation/credential/storage/TokenEntity;", "", "createQuery", "()Ljava/lang/String;", "LB4/g;", "statement", "entity", "", "b", "(LB4/g;Lcom/okta/authfoundation/credential/storage/TokenEntity;)V", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends AbstractC6264h<TokenEntity> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a f120761a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(G g10, a aVar) {
            super(g10);
            this.f120761a = aVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC6264h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(B4.g statement, TokenEntity entity) {
            Intrinsics.j(statement, "statement");
            Intrinsics.j(entity, "entity");
            statement.S1(1, entity.getId());
            statement.y2(2, entity.getEncryptedToken());
            String strA = this.f120761a.__stringStringMapTypeConverter.a(entity.j());
            if (strA == null) {
                statement.I(3);
            } else {
                statement.S1(3, strA);
            }
            String strA2 = this.f120761a.__jsonObjectTypeConverter.a(entity.getPayloadData());
            if (strA2 == null) {
                statement.I(4);
            } else {
                statement.S1(4, strA2);
            }
            statement.S1(5, entity.getKeyAlias());
            statement.S1(6, this.f120761a.f(entity.getTokenEncryptionType()));
            if (entity.getBiometricTimeout() == null) {
                statement.I(7);
            } else {
                statement.C(7, r0.intValue());
            }
            String strA3 = this.f120761a.__stringStringMapTypeConverter.a(entity.e());
            if (strA3 == null) {
                statement.I(8);
            } else {
                statement.S1(8, strA3);
            }
            statement.S1(9, entity.getId());
        }

        @Override // androidx.room.AbstractC6264h, androidx.room.S
        protected String createQuery() {
            return "UPDATE OR ABORT `TokenEntity` SET `id` = ?,`encryptedToken` = ?,`tags` = ?,`payloadData` = ?,`keyAlias` = ?,`tokenEncryptionType` = ?,`biometricTimeout` = ?,`encryptionExtras` = ? WHERE `id` = ?";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/okta/authfoundation/credential/storage/a$d;", "", "<init>", "()V", "", "Ljava/lang/Class;", "a", "()Ljava/util/List;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.okta.authfoundation.credential.storage.a$d, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final List<Class<?>> a() {
            return CollectionsKt.m();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TokenEntity.a.values().length];
            try {
                iArr[TokenEntity.a.f120748b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TokenEntity.a.f120749c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TokenEntity.a.f120750d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/okta/authfoundation/credential/storage/a$f", "Ljava/util/concurrent/Callable;", "", "Lcom/okta/authfoundation/credential/storage/TokenEntity;", "a", "()Ljava/util/List;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f implements Callable<List<? extends TokenEntity>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ N f120763b;

        f(N n10) {
            this.f120763b = n10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<TokenEntity> call() {
            String str = null;
            Cursor cursorG = C17824b.g(a.this.__db, this.f120763b, false, null);
            try {
                int iE = C17823a.e(cursorG, PreferencesHelper.PREF_ID);
                int iE2 = C17823a.e(cursorG, "encryptedToken");
                int iE3 = C17823a.e(cursorG, "tags");
                int iE4 = C17823a.e(cursorG, "payloadData");
                int iE5 = C17823a.e(cursorG, "keyAlias");
                int iE6 = C17823a.e(cursorG, "tokenEncryptionType");
                int iE7 = C17823a.e(cursorG, "biometricTimeout");
                int iE8 = C17823a.e(cursorG, "encryptionExtras");
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iE);
                    byte[] blob = cursorG.getBlob(iE2);
                    Map<String, String> mapB = a.this.__stringStringMapTypeConverter.b(cursorG.isNull(iE3) ? str : cursorG.getString(iE3));
                    if (mapB == null) {
                        throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.String>', but it was NULL.");
                    }
                    C cB = a.this.__jsonObjectTypeConverter.b(cursorG.isNull(iE4) ? str : cursorG.getString(iE4));
                    String string2 = cursorG.getString(iE5);
                    a aVar = a.this;
                    String string3 = cursorG.getString(iE6);
                    int i10 = iE;
                    Intrinsics.i(string3, "getString(...)");
                    TokenEntity.a aVarG = aVar.g(string3);
                    Integer numValueOf = cursorG.isNull(iE7) ? null : Integer.valueOf(cursorG.getInt(iE7));
                    Map<String, String> mapB2 = a.this.__stringStringMapTypeConverter.b(cursorG.isNull(iE8) ? null : cursorG.getString(iE8));
                    if (mapB2 == null) {
                        throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.String>', but it was NULL.");
                    }
                    arrayList.add(new TokenEntity(string, blob, mapB, cB, string2, aVarG, numValueOf, mapB2));
                    iE = i10;
                    str = null;
                }
                cursorG.close();
                this.f120763b.h();
                return arrayList;
            } catch (Throwable th2) {
                cursorG.close();
                this.f120763b.h();
                throw th2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/okta/authfoundation/credential/storage/a$g", "Ljava/util/concurrent/Callable;", "", "a", "()V", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g implements Callable<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TokenEntity f120765b;

        g(TokenEntity tokenEntity) {
            this.f120765b = tokenEntity;
        }

        public void a() {
            a.this.__db.beginTransaction();
            try {
                a.this.__deletionAdapterOfTokenEntity.handle(this.f120765b);
                a.this.__db.setTransactionSuccessful();
            } finally {
                a.this.__db.endTransaction();
            }
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Unit call() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/okta/authfoundation/credential/storage/a$h", "Ljava/util/concurrent/Callable;", "Lcom/okta/authfoundation/credential/storage/TokenEntity;", "a", "()Lcom/okta/authfoundation/credential/storage/TokenEntity;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h implements Callable<TokenEntity> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ N f120767b;

        h(N n10) {
            this.f120767b = n10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TokenEntity call() {
            TokenEntity tokenEntity = null;
            String string = null;
            Cursor cursorG = C17824b.g(a.this.__db, this.f120767b, false, null);
            try {
                int iE = C17823a.e(cursorG, PreferencesHelper.PREF_ID);
                int iE2 = C17823a.e(cursorG, "encryptedToken");
                int iE3 = C17823a.e(cursorG, "tags");
                int iE4 = C17823a.e(cursorG, "payloadData");
                int iE5 = C17823a.e(cursorG, "keyAlias");
                int iE6 = C17823a.e(cursorG, "tokenEncryptionType");
                int iE7 = C17823a.e(cursorG, "biometricTimeout");
                int iE8 = C17823a.e(cursorG, "encryptionExtras");
                if (cursorG.moveToFirst()) {
                    String string2 = cursorG.getString(iE);
                    byte[] blob = cursorG.getBlob(iE2);
                    Map<String, String> mapB = a.this.__stringStringMapTypeConverter.b(cursorG.isNull(iE3) ? null : cursorG.getString(iE3));
                    if (mapB == null) {
                        throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.String>', but it was NULL.");
                    }
                    C cB = a.this.__jsonObjectTypeConverter.b(cursorG.isNull(iE4) ? null : cursorG.getString(iE4));
                    String string3 = cursorG.getString(iE5);
                    a aVar = a.this;
                    String string4 = cursorG.getString(iE6);
                    Intrinsics.i(string4, "getString(...)");
                    TokenEntity.a aVarG = aVar.g(string4);
                    Integer numValueOf = cursorG.isNull(iE7) ? null : Integer.valueOf(cursorG.getInt(iE7));
                    if (!cursorG.isNull(iE8)) {
                        string = cursorG.getString(iE8);
                    }
                    Map<String, String> mapB2 = a.this.__stringStringMapTypeConverter.b(string);
                    if (mapB2 == null) {
                        throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.String>', but it was NULL.");
                    }
                    tokenEntity = new TokenEntity(string2, blob, mapB, cB, string3, aVarG, numValueOf, mapB2);
                }
                cursorG.close();
                this.f120767b.h();
                return tokenEntity;
            } catch (Throwable th2) {
                cursorG.close();
                this.f120767b.h();
                throw th2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/okta/authfoundation/credential/storage/a$i", "Ljava/util/concurrent/Callable;", "", "a", "()V", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i implements Callable<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TokenEntity f120769b;

        i(TokenEntity tokenEntity) {
            this.f120769b = tokenEntity;
        }

        public void a() {
            a.this.__db.beginTransaction();
            try {
                a.this.__insertionAdapterOfTokenEntity.insert((AbstractC6266j) this.f120769b);
                a.this.__db.setTransactionSuccessful();
            } finally {
                a.this.__db.endTransaction();
            }
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Unit call() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/okta/authfoundation/credential/storage/a$j", "Ljava/util/concurrent/Callable;", "", "a", "()V", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class j implements Callable<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TokenEntity[] f120771b;

        j(TokenEntity[] tokenEntityArr) {
            this.f120771b = tokenEntityArr;
        }

        public void a() {
            a.this.__db.beginTransaction();
            try {
                a.this.__updateAdapterOfTokenEntity.handleMultiple(this.f120771b);
                a.this.__db.setTransactionSuccessful();
            } finally {
                a.this.__db.endTransaction();
            }
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Unit call() {
            a();
            return Unit.f143329a;
        }
    }

    public a(G __db) {
        Intrinsics.j(__db, "__db");
        this.__stringStringMapTypeConverter = new Zs.b();
        this.__jsonObjectTypeConverter = new Zs.a();
        this.__db = __db;
        this.__insertionAdapterOfTokenEntity = new C1975a(__db, this);
        this.__deletionAdapterOfTokenEntity = new b(__db);
        this.__updateAdapterOfTokenEntity = new c(__db, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String f(TokenEntity.a _value) {
        int i10 = e.$EnumSwitchMapping$0[_value.ordinal()];
        if (i10 == 1) {
            return "DEFAULT";
        }
        if (i10 == 2) {
            return "BIO_ONLY";
        }
        if (i10 == 3) {
            return "BIO_AND_PIN";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // Xs.a
    public Object a(TokenEntity tokenEntity, Continuation<? super Unit> continuation) {
        Object objE = C6260d.INSTANCE.e(this.__db, true, new g(tokenEntity), continuation);
        return objE == IntrinsicsKt.f() ? objE : Unit.f143329a;
    }

    @Override // Xs.a
    public Object b(TokenEntity tokenEntity, Continuation<? super Unit> continuation) {
        Object objE = C6260d.INSTANCE.e(this.__db, true, new i(tokenEntity), continuation);
        return objE == IntrinsicsKt.f() ? objE : Unit.f143329a;
    }

    @Override // Xs.a
    public Object c(TokenEntity[] tokenEntityArr, Continuation<? super Unit> continuation) {
        Object objE = C6260d.INSTANCE.e(this.__db, true, new j(tokenEntityArr), continuation);
        return objE == IntrinsicsKt.f() ? objE : Unit.f143329a;
    }

    @Override // Xs.a
    public Object d(Continuation<? super List<TokenEntity>> continuation) {
        N nA = N.INSTANCE.a("SELECT * FROM TokenEntity", 0);
        return C6260d.INSTANCE.d(this.__db, false, C17824b.a(), new f(nA), continuation);
    }

    @Override // Xs.a
    public Object e(String str, Continuation<? super TokenEntity> continuation) {
        N nA = N.INSTANCE.a("SELECT * FROM TokenEntity WHERE id = ?", 1);
        nA.S1(1, str);
        return C6260d.INSTANCE.d(this.__db, false, C17824b.a(), new h(nA), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TokenEntity.a g(String _value) {
        int iHashCode = _value.hashCode();
        if (iHashCode != -2032180703) {
            if (iHashCode != 1359933078) {
                if (iHashCode == 1776492707 && _value.equals("BIO_ONLY")) {
                    return TokenEntity.a.f120749c;
                }
            } else if (_value.equals("BIO_AND_PIN")) {
                return TokenEntity.a.f120750d;
            }
        } else if (_value.equals("DEFAULT")) {
            return TokenEntity.a.f120748b;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + _value);
    }
}
