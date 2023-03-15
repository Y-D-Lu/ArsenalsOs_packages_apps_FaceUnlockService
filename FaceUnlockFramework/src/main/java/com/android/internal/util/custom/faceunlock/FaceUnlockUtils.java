/*
* Copyright (C) 2022 The Pixel Experience Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.android.internal.util.custom.faceunlock;

import android.content.ComponentName;
import android.content.Intent;
import android.os.SystemProperties;

public class FaceUnlockUtils {
    public static boolean isFaceUnlockSupported() {
        return SystemProperties.getBoolean("ro.face_unlock_service.enabled", false);
    }

    public static Intent getServiceIntent() {
        Intent intent = new Intent("cn.arsenals.os.faceunlock.BIND");
        intent.setComponent(ComponentName.unflattenFromString(
                "cn.arsenals.os.faceunlock/cn.arsenals.os.faceunlock.service.FaceAuthService"));
        return intent;
    }

    public static String getServicePackageName() {
        return "cn.arsenals.os.faceunlock";
    }
}
