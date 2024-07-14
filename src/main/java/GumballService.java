

class GimballService {
    private enum machine_state{
        NO_QUARTER,
        HAS_QUARTER,
        GIMBAL_SOLD,
        OUT_OF_GIMBAL
    }
    private machine_state state;
    private int inventory;


    public GimballService(){
        state = machine_state.NO_QUARTER;
        inventory = 5;
    }


    public void  insert_quarter(){
        if(state == machine_state.NO_QUARTER){
            state = machine_state.HAS_QUARTER;
        }
    }

    public void eject_quarter(){
        if(state == machine_state.HAS_QUARTER){
            state = machine_state.NO_QUARTER;
        }
    }

    public void turn_crank(){
        if(state == machine_state.HAS_QUARTER){
            state = machine_state.GIMBAL_SOLD;
        }
    }

    public void dispenss_gimbal(){
        if(inventory > 0){
            inventory--;
            state = machine_state.NO_QUARTER;
        }else{
            state = machine_state.OUT_OF_GIMBAL;
        }
    }

}




