
import { NativeModules, Alert } from 'react-native';

// const { RNUssdDial } = NativeModules;

var RNUssdDial = {
    getDeviceName: async () => {
        return await NativeModules.Device.getDeviceName()
    },
    dialNumber: async (number) => {
        return await NativeModules.Device.dialNumber()
    }
}

export default RNUssdDial;
