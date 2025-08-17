package androidx.room;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"", "", "migrationStartAndEndVersions", "migrationsNotRequiredFrom", "", "b", "(Ljava/util/Set;Ljava/util/Set;)V", "Landroidx/room/G;", "Landroidx/room/e;", "configuration", "a", "(Landroidx/room/G;Landroidx/room/e;)V", "c", "room-runtime_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/room/RoomDatabaseKt")
@SourceDebugExtension
/* loaded from: classes4.dex */
final /* synthetic */ class I {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009e, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.room.G r9, androidx.room.C6119e r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.j(r9, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.Intrinsics.j(r10, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r1 = r9.getRequiredAutoMigrationSpecClasses()
            java.util.List<u4.a> r2 = r10.autoMigrationSpecs
            int r2 = r2.size()
            boolean[] r3 = new boolean[r2]
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r4 = r1.hasNext()
            r5 = -1
            if (r4 == 0) goto L7f
            java.lang.Object r4 = r1.next()
            kotlin.reflect.KClass r4 = (kotlin.reflect.KClass) r4
            java.util.List<u4.a> r6 = r10.autoMigrationSpecs
            java.util.Collection r6 = (java.util.Collection) r6
            int r6 = r6.size()
            int r6 = r6 + r5
            if (r6 < 0) goto L4f
        L37:
            int r7 = r6 + (-1)
            java.util.List<u4.a> r8 = r10.autoMigrationSpecs
            java.lang.Object r8 = r8.get(r6)
            boolean r8 = r4.s(r8)
            if (r8 == 0) goto L4a
            r5 = 1
            r3[r6] = r5
            r5 = r6
            goto L4f
        L4a:
            if (r7 >= 0) goto L4d
            goto L4f
        L4d:
            r6 = r7
            goto L37
        L4f:
            if (r5 < 0) goto L5b
            java.util.List<u4.a> r6 = r10.autoMigrationSpecs
            java.lang.Object r5 = r6.get(r5)
            r0.put(r4, r5)
            goto L1f
        L5b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "A required auto migration spec ("
            r9.append(r10)
            java.lang.String r10 = r4.t()
            r9.append(r10)
            java.lang.String r10 = ") is missing in the database configuration."
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L7f:
            java.util.List<u4.a> r1 = r10.autoMigrationSpecs
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            int r1 = r1 + r5
            if (r1 < 0) goto L9f
        L8a:
            int r4 = r1 + (-1)
            if (r1 >= r2) goto L97
            boolean r1 = r3[r1]
            if (r1 == 0) goto L97
            if (r4 >= 0) goto L95
            goto L9f
        L95:
            r1 = r4
            goto L8a
        L97:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."
            r9.<init>(r10)
            throw r9
        L9f:
            java.util.List r9 = r9.createAutoMigrations(r0)
            java.util.Iterator r9 = r9.iterator()
        La7:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lc5
            java.lang.Object r0 = r9.next()
            u4.b r0 = (u4.b) r0
            androidx.room.G$e r1 = r10.migrationContainer
            int r2 = r0.startVersion
            int r3 = r0.endVersion
            boolean r1 = r1.c(r2, r3)
            if (r1 != 0) goto La7
            androidx.room.G$e r1 = r10.migrationContainer
            r1.a(r0)
            goto La7
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.I.a(androidx.room.G, androidx.room.e):void");
    }

    public static final void b(Set<Integer> migrationStartAndEndVersions, Set<Integer> migrationsNotRequiredFrom) {
        Intrinsics.j(migrationStartAndEndVersions, "migrationStartAndEndVersions");
        Intrinsics.j(migrationsNotRequiredFrom, "migrationsNotRequiredFrom");
        if (migrationStartAndEndVersions.isEmpty()) {
            return;
        }
        Iterator<Integer> it = migrationStartAndEndVersions.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (migrationsNotRequiredFrom.contains(Integer.valueOf(iIntValue))) {
                throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: " + iIntValue).toString());
            }
        }
    }

    public static final void c(G g10, C6119e configuration) {
        Intrinsics.j(g10, "<this>");
        Intrinsics.j(configuration, "configuration");
        Map<KClass<?>, List<KClass<?>>> requiredTypeConverterClassesMap$room_runtime_release = g10.getRequiredTypeConverterClassesMap$room_runtime_release();
        boolean[] zArr = new boolean[configuration.typeConverters.size()];
        for (Map.Entry<KClass<?>, List<KClass<?>>> entry : requiredTypeConverterClassesMap$room_runtime_release.entrySet()) {
            KClass<?> key = entry.getKey();
            for (KClass<?> kClass : entry.getValue()) {
                int size = configuration.typeConverters.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i10 = size - 1;
                        if (kClass.s(configuration.typeConverters.get(size))) {
                            zArr[size] = true;
                            break;
                        } else if (i10 < 0) {
                            break;
                        } else {
                            size = i10;
                        }
                    }
                    size = -1;
                } else {
                    size = -1;
                }
                if (size < 0) {
                    throw new IllegalArgumentException(("A required type converter (" + kClass.t() + ") for " + key.t() + " is missing in the database configuration.").toString());
                }
                g10.addTypeConverter$room_runtime_release(kClass, configuration.typeConverters.get(size));
            }
        }
        int size2 = configuration.typeConverters.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i11 = size2 - 1;
            if (!zArr[size2]) {
                throw new IllegalArgumentException("Unexpected type converter " + configuration.typeConverters.get(size2) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
            }
            if (i11 < 0) {
                return;
            } else {
                size2 = i11;
            }
        }
    }
}
