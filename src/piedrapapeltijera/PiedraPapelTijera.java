package piedrapapeltijera;

public class PiedraPapelTijera {

    public static final int EMPATE = 0;
    public static final int PIEDRA = 1;
    public static final int PAPEL = 2;
    public static final int TIJERA = 3;
    public static final int LAGARTO = 4;
    public static final int SPOCK = 5;

    public static final int MEJORDE3 = 3;
    public static final int MEJORDE5 = 5;
    public static final int MEJORDE10 = 10;

    private static int apuestaUsuario;
    private static int apuestaRival;

    private static int puntuacionUsuario = 0;
    private static int puntuacionRival = 0;
    private static int puntuacionEmpate = 0;

    private static int duracionPartida;

    static int vencedor(int apuestaUsuario, int apuestaRival) {

        PiedraPapelTijera.apuestaUsuario = apuestaUsuario;
        PiedraPapelTijera.apuestaRival = apuestaRival;

        int vencedor = -1;

        switch (apuestaUsuario) {
            case PIEDRA:
                if (apuestaRival == PIEDRA) {
                    vencedor = EMPATE;
                } else {
                    if (apuestaRival == PAPEL) {
                        vencedor = PAPEL;
                    } else {
                        if (apuestaRival == TIJERA) {
                            vencedor = PIEDRA;
                        } else {
                            if (apuestaRival == LAGARTO) {
                                vencedor = PIEDRA;
                            } else {
                                if (apuestaRival == SPOCK) {
                                    vencedor = SPOCK;
                                }
                            }
                        }
                    }
                }
                break;
            case PAPEL:
                if (apuestaRival == PAPEL) {
                    vencedor = EMPATE;
                } else {
                    if (apuestaRival == PIEDRA) {
                        vencedor = PAPEL;
                    } else {
                        if (apuestaRival == TIJERA) {
                            vencedor = TIJERA;
                        } else {
                            if (apuestaRival == LAGARTO) {
                                vencedor = LAGARTO;
                            } else {
                                if (apuestaRival == SPOCK) {
                                    vencedor = PAPEL;
                                }
                            }
                        }
                    }
                }
                break;
            case TIJERA:
                if (apuestaRival == TIJERA) {
                    vencedor = EMPATE;
                } else {
                    if (apuestaRival == PIEDRA) {
                        vencedor = PIEDRA;
                    } else {
                        if (apuestaRival == PAPEL) {
                            vencedor = TIJERA;
                        } else {
                            if (apuestaRival == LAGARTO) {
                                vencedor = TIJERA;
                            } else {
                                if (apuestaRival == SPOCK) {
                                    vencedor = SPOCK;
                                }
                            }
                        }
                    }
                }
                break;
            case LAGARTO:
                if (apuestaRival == LAGARTO) {
                    vencedor = EMPATE;
                } else {
                    if (apuestaRival == PIEDRA) {
                        vencedor = PIEDRA;
                    } else {
                        if (apuestaRival == PAPEL) {
                            vencedor = LAGARTO;
                        } else {
                            if (apuestaRival == TIJERA) {
                                vencedor = TIJERA;
                            } else {
                                if (apuestaRival == SPOCK) {
                                    vencedor = LAGARTO;
                                }
                            }
                        }
                    }
                }
                break;
            case SPOCK:
                if (apuestaRival == SPOCK) {
                    vencedor = EMPATE;
                } else {
                    if (apuestaRival == PIEDRA) {
                        vencedor = SPOCK;
                    } else {
                        if (apuestaRival == PAPEL) {
                            vencedor = PAPEL;
                        } else {
                            if (apuestaRival == TIJERA) {
                                vencedor = SPOCK;
                            } else {
                                if (apuestaRival == LAGARTO) {
                                    vencedor = LAGARTO;
                                }
                            }
                        }
                    }
                }
                break;
        }
        return vencedor;
    }

  
    static void puntuar(int manoVencedora) {

        if (manoVencedora == apuestaUsuario) {
            ++puntuacionUsuario;
        } else {
            if (manoVencedora == apuestaRival) {
                ++puntuacionRival;
            } else {
                if (manoVencedora == EMPATE) {
                    ++puntuacionEmpate;
                }
            }
        }
        System.out.println("Vencedor " + manoVencedora);
        System.out.println("Puntuacion Usuario " + puntuacionUsuario);
        System.out.println("Puntuacion PC " + puntuacionRival);
        System.out.println("Puntuacion Empate " + puntuacionEmpate);
    }

    static boolean partidaAcabada() {

        boolean partidaAcabada = true;
        
        duracionPartida = JDialogConfiguracion.getDuracionPartida();

        switch (duracionPartida) {
            case 0:
                if (!((puntuacionRival + puntuacionUsuario) >= MEJORDE3)) {
                    partidaAcabada = false;
                }
                break;
            case 1:
                if (!((puntuacionRival + puntuacionUsuario) >= MEJORDE5)) {
                    partidaAcabada = false;
                }
                break;
            case 2:
                if (!((puntuacionRival + puntuacionUsuario) >= MEJORDE10)) {
                    partidaAcabada = false;
                }
                break;
        }
        return partidaAcabada;
    }

    public static int getPuntuacionUsuario() {
        return puntuacionUsuario;
    }

    public static int getPuntuacionRival() {
        return puntuacionRival;
    }

    public static int getPuntuacionEmpate() {
        return puntuacionEmpate;
    }

    public static void reiniciar() {
        JDialogConfiguracion.setNick("");
        puntuacionEmpate = 0;
        puntuacionRival = 0;
        puntuacionUsuario = 0;
    }

}
